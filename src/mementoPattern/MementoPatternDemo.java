package mementoPattern;
/***
 * 
 * @author Gopal
 * it hold main method
 */
public class MementoPatternDemo {
	   /***
	    * main method
	    * @param args
	    */
	   public static void main(String[] args) {
	   
		  /***
		   * create a object of Originator class
		   */
	      Originator originator = new Originator();
	      
	      /***
		   * create a object of CareTaker class
		   */
	      CareTaker careTaker = new CareTaker();
	      
	      /***
	       * call method
	       */
	      originator.setState("State #1");
	      originator.setState("State #2");
	      /***
	       * save state
	       */
	      careTaker.add(originator.saveStateToMemento());
	      
	      originator.setState("State #3");
	      careTaker.add(originator.saveStateToMemento());
	      
	      originator.setState("State #4");
	      /***
	       * print current state
	       */
	      System.out.println("Current State: " + originator.getState());		
	      
	      originator.getStateFromMemento(careTaker.get(0));
	      /***
	       * print first saved state
	       */
	      System.out.println("First saved State: " + originator.getState());
	      originator.getStateFromMemento(careTaker.get(1));
	      /***
	       * print second saved state
	       */
	      System.out.println("Second saved State: " + originator.getState());
	   }
	}
