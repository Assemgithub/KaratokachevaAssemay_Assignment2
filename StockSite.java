package com.company;

public class StockSite implements Observer {
    @Override
    public void update(Stock stock) {
        System.out.println("StockSite - The Price of "+stock.getStockName()+" product has changed to:"+stock.getStockPrice());
    }
}
