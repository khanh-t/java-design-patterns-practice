
/**
 * @author Khanh Tran
 */
import java.util.Random;

public class Teleport implements Command
{
    DrWho drWho;
    int randomVertical;
    int randomHorizontal;
    Random rnd = new Random();
    
    public Teleport(DrWho drWho) {
        this.drWho = drWho;
        //random number between -50 and 50.
        randomVertical = rnd.nextInt(50 + 1 + 50) -50;
        randomHorizontal = rnd.nextInt(50 + 1 + 50) -50;
    }
    
    public void execute() {
        drWho.moveVertical(randomVertical);
        drWho.moveHorizontal(randomHorizontal);
    }
    
    public void undo() {
        drWho.moveVertical(-randomVertical);
        drWho.moveHorizontal(-randomHorizontal);
    }
}
