package mediatorPattern;

/***
 * 
 * @author Gopal Vaghasiya
 * in this class extends User class
 */
public class UserImpl extends User {
    
	/***
	 * constructor
	 * @param med
	 * @param name
	 */
	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	/***
	 * send a message
	 */
	@Override
	public void send(String msg){
		System.out.println(this.name+": Sending Message="+msg);
		mediator.sendMessage(msg, this);
	}
	
	/***
	 * receive a message
	 */
	@Override
	public void receive(String msg) {
		System.out.println(this.name+": Received Message:"+msg);
	}

}
