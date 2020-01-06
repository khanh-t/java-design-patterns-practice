
/**
 * @author Khanh Tran
 */
public class Driver
{
    public static void main(String[] args) {
        Stock ibm = new Stock("IBM", 120.00);
        ibm.attach(new Investor("Sorros", ibm));
        ibm.attach(new Investor("Berkshire", ibm));
        
        ibm.setPrice(120.10);
        ibm.setPrice(121.00);
        ibm.setPrice(120.50);
        ibm.setPrice(120.75);        
    }   
}
