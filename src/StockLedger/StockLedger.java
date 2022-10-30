package StockLedger;

import java.util.ArrayList;

public class StockLedger implements StockLedgerInterface{

    ArrayList<LedgerEntry> ledger;

    public StockLedger() {
        ledger = new ArrayList<>();
    }

    public void buy(String stockSymbol, int sharesBought, double pricePerShare) {
        LedgerEntry l = getEntry(stockSymbol);

        for (int i = 0; i < sharesBought; i++) {
            l.add(pricePerShare);
        }
    }

    public double sell(String stockSymbol, int sharesSold, double pricePerShare) {
        if (!contains(stockSymbol)) {

        }
        LedgerEntry l;
        if (sharesSold > l.getQuantity())

        double purchaseCost = 0.0;

        for (int i = 0; i < sharesSold; i++) {

        }

        return 0;
    }

    public boolean contains(String stockSymbol) {
        return false;
    }

    public int howMany(String stockSymbol) {
        if (contains(stockSymbol)) {
            return getEntry(stockSymbol).getQuantity();
        }
    }

    public LedgerEntry getEntry(String stockSymbol) {
        LedgerEntry l;

        if (!contains(stockSymbol)) {
            l = new LedgerEntry(stockSymbol);
            ledger.add(l);
        } else {
            l = ledger.get(ledger.indexOf(stockSymbol));
        }

        return l;
    }
}
