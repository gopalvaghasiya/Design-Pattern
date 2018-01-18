package chainofresponsibility;
/***
 * 
 * @author Gopal Vaghasiya
 * it is extends Logger class
 *
 */
public class ConsoleBasedLogger extends Logger {
	
	/***
	 * 
	 * @param levels
	 * constructor
	 */
	public ConsoleBasedLogger(int levels) {
		// TODO Auto-generated constructor stub
		this.levels=levels;
	}

	
	/***
	 * it is print through logger and override method
	 */
	@Override
	protected void displayLogInfo(String msg) {
		// TODO Auto-generated method stub
		
		System.out.println("CONSOLE LOGGER INFO: "+msg);
	}

}
