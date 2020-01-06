
/**
 * @author Khanh Tran
 */
import java.util.*;

public class RemoteControlWithUndoRedo {
	Command[] doCommands;
	Stack undoStack = new Stack();
	Stack redoStack = new Stack();
 
	public RemoteControlWithUndoRedo() {
		doCommands = new Command[5];
 
		Command noCommand = new NoCommand();
		for(int i=0;i<5;i++) {
			doCommands[i] = noCommand;
		}
	}
  
	public void setCommand(int slot, Command command) {
		doCommands[slot] = command;
	}
 
	public void upButtonWasPushed(int slot) {
		doCommands[slot].execute();
		undoStack.push(doCommands[slot]);
	}
	
	public void downButtonWasPushed(int slot) {
		doCommands[slot].execute();
		undoStack.push(doCommands[slot]);
	}
	
	public void leftButtonWasPushed(int slot) {
		doCommands[slot].execute();
		undoStack.push(doCommands[slot]);
	}
	
	public void rightButtonWasPushed(int slot) {
		doCommands[slot].execute();
		undoStack.push(doCommands[slot]);
	}
	
	public void teleportButtonWasPushed(int slot) {
	        doCommands[slot].execute();
	        undoStack.push(doCommands[slot]);
	}
 
	public void undoButtonWasPushed() {
	        if (undoStack.empty() == false) {
	           Command command = (Command) undoStack.pop();
	           command.undo();
	           redoStack.push(command);
	       }
	}
	
	public void redoButtonWasPushed() {
	        if (redoStack.empty() == false) {
	           Command command = (Command) redoStack.pop();
	           command.undo();
	           undoStack.push(command);
	       }
	}
}
