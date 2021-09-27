package com.company;

public class Main {

    public static void main(String[] args) {
  
        Google google = new Google();
        Microsoft microsoft = new Microsoft();
        Apple apple = new Apple();


        StockSite displayBoard = new StockSite();


        google.registerObserver(displayBoard);

        microsoft.registerObserver(displayBoard);

        apple.registerObserver(displayBoard);


        {
            google.updateStockPrice((int)(Math.random()*51)+1);
            microsoft.updateStockPrice((int)(Math.random()*51)+1);
            apple.updateStockPrice((int)(Math.random()*51)+1);
        }

    }
}
