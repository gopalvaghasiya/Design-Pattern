package observerPattern;
/***
 * 
 * @author Gopal Vaghasiya
 *  in this class update() method implement
 *
 */
public class BinaryObserver extends Observer{

	   /***
	    * constructor
	    * @param subject
	    */
	   public BinaryObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   /***
	    * override update() method
	    */
	   @Override
	   public void update() {
	      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
	   }
	}
