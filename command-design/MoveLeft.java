
/**
 * @author Khanh Tran
 */
public class MoveLeft implements Command
{
    DrWho drWho;
    
    public MoveLeft(DrWho drWho) {
        this.drWho = drWho;
    }
    
    public void execute() {
        drWho.moveLeft();
    }
    
    public void undo() {
        drWho.moveRight();
    }
}
