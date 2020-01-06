
/**
 * @author Khanh Tran
 */
public class MoveRight implements Command
{
    DrWho drWho;
    
    public MoveRight(DrWho drWho) {
        this.drWho = drWho;
    }
    
    public void execute() {
        drWho.moveRight();
    }
    
    public void undo() {
        drWho.moveLeft();
    }
}
