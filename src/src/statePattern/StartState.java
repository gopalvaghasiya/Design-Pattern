package statePattern;
/***
 * 
 * @author Gopal Vaghasiya
 * in this class doAction() and toString() method hold
 */
public class StartState implements State {

	   public void doAction(Context context) {
	      System.out.println("Player is in start state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Start State";
	   }
	}
