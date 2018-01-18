package observerPattern;

import java.util.ArrayList;
import java.util.List;
/***
 * 
 * @author Gopal Vaghasiya
 *  in this class all getter and setter method
 *
 */
public class Subject {
   
   /***
    * list decaler
    */
   private List<Observer> observers = new ArrayList<Observer>();
   private int state;

   /***
    * getter method
    * @return state
    */
   public int getState() {
      return state;
   }
   
   /***
    * set a state
    * @param state
    */
   public void setState(int state) {
      this.state = state;
      /***
       * method call
       */
      notifyAllObservers();
   }

   /***
    * 
    * @param observer
    */
   public void attach(Observer observer){
      observers.add(observer);		
   }

   /***
    * iterate observers
    */
   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}
