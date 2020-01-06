
/**
 * @author Khanh Tran
 */
public class Investor implements Observer
{
    private String name;
    private double price;
    private Stock stock;
    
    public Investor(String n, Stock s) {
        name = n;
        stock = s;
        price = stock.getPrice();
    }
    
    public void update(double p) {
        price = p;
        System.out.println("Notified " + name + " of " + stock.getSymbol() +
        "'s change to " + price);
    }
}
