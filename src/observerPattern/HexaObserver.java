package observerPattern;
/***
 * 
 * @author Gopal Vaghasiya
 *  in this class update() method implement
 *
 */
public class HexaObserver extends Observer{

	/***
	    * constructor
	    * @param subject
	    */
	   public HexaObserver(Subject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	   /***
	    * override update() method
	    */
	   @Override
	   public void update() {
	      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
	   }
	}