package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stock implements Observable{
    private List<Observer> observers;

    public Stock(){
        observers = new ArrayList<Observer>();
    }

    private String name;
    private int price;

    public String getStockName(){
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
            this.observers.add(observer);
        }

    @Override
    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while(it.hasNext()){
            Observer observer = it.next();
            observer.update(this);
        }
    }


    public int getStockPrice(){
        return price;
    }

    public void updateStockPrice(int updatedPrice){
        this.price = updatedPrice;
        this.notifyObservers();
    }

    public void setName(String stockName){
        this.name = stockName;
    }
}

