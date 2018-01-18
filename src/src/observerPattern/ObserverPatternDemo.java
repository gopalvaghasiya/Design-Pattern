package observerPattern;
/***
 * 
 * @author Gopal Vaghasiya
 *  in this class main method
 *
 */
public class ObserverPatternDemo {
	   /***
	    * main method
	    * @param args
	    */
	   public static void main(String[] args) {
	      Subject subject = new Subject();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      /***
	       * print
	       */
	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	   }
	}
