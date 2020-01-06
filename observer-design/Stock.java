
import java.util.ArrayList;

/**
 * @author Khanh Tran
 */
public class Stock implements Subject
{
    private ArrayList<Observer> observers;
    private String symbol;
    private double price;
    
    public Stock(String s, double p) {
        symbol = s;
        price = p;
        observers = new ArrayList<Observer>();
    }
    
    public void attach(Observer o) {
        observers.add(o);
    }
    
    public void detach(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }
    
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(price);
        }
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public void setPrice(double p) {
        price = p;
        notifyObservers();
    }
}
