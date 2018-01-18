package mementoPattern;
/***
 * 
 * @author Gopal Vaghasiya
 *
 */
public class Memento {
	   private String state;
	   
	   /***
	    * constructor
	    * @param state
	    */
	   public Memento(String state){
	      this.state = state;
	   }

	   /***
	    * get a state
	    * @return state
	    */
	   public String getState(){
	      return state;
	   }	
	}
