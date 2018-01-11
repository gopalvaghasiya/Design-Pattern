package observerPattern;
/***
 * 
 * @author Gopal Vaghasiya
 *  in this abstract class declare a method
 *
 */
public abstract class Observer {
	   protected Subject subject;
	   public abstract void update();
	}