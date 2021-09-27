package com.company;

public interface Observable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
