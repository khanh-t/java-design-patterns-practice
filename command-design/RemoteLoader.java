
/**
 * @author Khanh Tran
 */
public class RemoteLoader
{
    public static void main(String[] args) {
        RemoteControlWithUndoRedo remoteControl = new RemoteControlWithUndoRedo();
        
        DrWho d = DrWho.getInstance();
        d.makeVisible();
        
        MoveUp moveUp = new MoveUp(d);
        MoveDown moveDown = new MoveDown(d);
        MoveLeft moveLeft = new MoveLeft(d);
        MoveRight moveRight = new MoveRight(d);
        Teleport teleport = new Teleport(d);
        
        //setting up remote
        remoteControl.setCommand(0, moveUp);
        remoteControl.setCommand(1, moveDown);
        remoteControl.setCommand(2, moveLeft);
        remoteControl.setCommand(3, moveRight);
        remoteControl.setCommand(4, teleport);
        
        //testing if commands work
        remoteControl.upButtonWasPushed(0);
        remoteControl.upButtonWasPushed(0);
        remoteControl.upButtonWasPushed(0);
        remoteControl.downButtonWasPushed(1);
        remoteControl.downButtonWasPushed(1);
        remoteControl.downButtonWasPushed(1);
        remoteControl.leftButtonWasPushed(2);
        remoteControl.leftButtonWasPushed(2);
        remoteControl.leftButtonWasPushed(2);
        remoteControl.rightButtonWasPushed(3);
        remoteControl.rightButtonWasPushed(3);
        remoteControl.rightButtonWasPushed(3);
        remoteControl.teleportButtonWasPushed(4);
        remoteControl.teleportButtonWasPushed(4);
        remoteControl.undoButtonWasPushed();
        remoteControl.redoButtonWasPushed();
    }
}
