package chainofresponsibility;
/***
 * 
 * @author Gopal Vaghasiya
 * it is extends Logger class
 *
 */
public class DebugBasedLogger extends Logger {
	
	
	/***
	 * 
	 * @param levels
	 * constructor
	 */
	public DebugBasedLogger(int levels) {
		// TODO Auto-generated constructor stub
		this.levels=levels;
	}

	/***
	 * it is print through logger and override
	 */
	@Override
	protected void displayLogInfo(String msg) {
		// TODO Auto-generated method stub
		
		System.out.println("DEBUG LOGGER INFO: "+msg);
	}

}
