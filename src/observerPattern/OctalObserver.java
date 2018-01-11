package observerPattern;

/***
 * 
 * @author Gopal Vaghasiya
 *  in this class all update() method implement
 *
 */
public class OctalObserver extends Observer{

	/***
	    * constructor
	    * @param subject
	    */
	   public OctalObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   /***
	    * override update() method
	    */
	   @Override
	   public void update() {
	     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
	   }
	}