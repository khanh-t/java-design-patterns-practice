
/**
 * @author Khanh Tran
 */
public class MoveDown implements Command
{
    DrWho drWho;
    
    public MoveDown(DrWho drWho) {
        this.drWho = drWho;
    }
    
    public void execute() {
        drWho.moveDown();
    }
    
    public void undo() {
        drWho.moveUp();
    }
}
