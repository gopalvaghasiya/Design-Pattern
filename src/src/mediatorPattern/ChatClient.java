package mediatorPattern;

/***
 * 
 * @author Gopal Vaghasiya
 * in this class hold main method
 */
public class ChatClient {

	/***
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		/***
		 * ChatMediatorImplclass class object created through ChatMediator interface
		 */
		ChatMediator mediator = new ChatMediatorImpl();
		
		/***
		 * UserImpl class object created through User interface
		 */
		User user1 = new UserImpl(mediator, "Pankaj");
		User user2 = new UserImpl(mediator, "Lisa");
		User user3 = new UserImpl(mediator, "Saurabh");
		User user4 = new UserImpl(mediator, "David");
		
		/***
		 * function call
		 */
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user1.send("Hi All");
		
	}

}
