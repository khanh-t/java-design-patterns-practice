
/**
 * @author Khanh Tran
 */
public class MoveUp implements Command
{
    DrWho drWho;
    
    public MoveUp(DrWho drWho) {
        this.drWho = drWho;
    }
    
    public void execute() {
        drWho.moveUp();
    }
    
    public void undo() {
        drWho.moveDown();
    }
}
