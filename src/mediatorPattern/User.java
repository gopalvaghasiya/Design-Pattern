package mediatorPattern;

/***
 * 
 * @author Gopal Vaghasiya
 * it is abstract class 
 */
public abstract class User {
	protected ChatMediator mediator;
	protected String name;
	
	/***
	 * constructor
	 * @param med
	 * @param name
	 */
	public User(ChatMediator med, String name){
		this.mediator=med;
		this.name=name;
	}
	
	public abstract void send(String msg);
	public abstract void receive(String msg);
}
