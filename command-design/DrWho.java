
/**
 * @author Khanh Tran
 */

public class DrWho extends Person
{
   private static DrWho uniqueInstance;
   
   private DrWho() {}
   
   public static DrWho getInstance() {
       if (uniqueInstance == null) {
            uniqueInstance = new DrWho();
        }
        return uniqueInstance;
    }
    
   public void moveUp()
    {
        moveVertical(-10);
    }
    
   public void moveDown() 
   {
       moveVertical(10);
   }
   
   public void moveLeft()
   {
       moveHorizontal(-10);
   }
   
   public void moveRight()
   {
       moveHorizontal(10);
   }
}
