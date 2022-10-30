package StockLedger;

import Deque.LinkedDeque;

public class LedgerEntry {
    String symbol;
    LinkedDeque<StockPurchase> purchases;

    public LedgerEntry(String symbol) {
        this.symbol = symbol;
        purchases = new LinkedDeque<>();
    }

    public String getSymbol() {
        return symbol;
    }

    public int getQuantity() {
        return purchases.getSize();
    }

    public double getSmallest() {
        return 0.0;
    }

    public double getLargest() {
        return 0.0;
    }

    public void add(double price) {
        purchases.addToBack(new StockPurchase(symbol, price));
    }

    public double remove() {
        return purchases.removeFront().getCost();
    }




}
