package chainofresponsibility;
/***
 * 
 * @author Gopal Vaghasiya
 * it is extends Logger class
 *
 */
public class ErrorBasedLogger extends Logger {
	
	/**
	 * 
	 * @param levels
	 */
	public ErrorBasedLogger(int levels) {
		// TODO Auto-generated constructor stub
		this.levels=levels;
	}

	/***
	 * it is print through error logger and override
	 */
	@Override
	protected void displayLogInfo(String msg) {
		// TODO Auto-generated method stub
		
		System.out.println("ERROR LOGGER INFO: "+msg);
	}
	

}
