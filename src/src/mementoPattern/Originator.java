package mementoPattern;
/***
 * 
 * @author Gopal Vaghasiya
 *
 */
public class Originator {
	   private String state;
	   /***
	    * setter method of state
	    * @param state
	    */
	   public void setState(String state){
	      this.state = state;
	   }

	   /***
	    * getter method of state
	    * @return state
	    */
	   public String getState(){
	      return state;
	   }

	   /***
	    * saved new state
	    * @return
	    */
	   public Memento saveStateToMemento(){
	      return new Memento(state);
	   }

	   /***
	    * get a state from momento
	    * @param memento
	    */
	   public void getStateFromMemento(Memento memento){
	      state = memento.getState();
	   }
	}