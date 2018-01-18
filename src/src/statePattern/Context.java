package statePattern;
/***
 * 
 * @author Gopal Vaghasiya
 * in this class getter and setter method hold
 */
public class Context {
	   private State state;

	   public Context(){
	      state = null;
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
	}
