package mediatorPattern;


import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author Gopal Vaghasiya
 * in this class implements ChatMediator interface
 */
public class ChatMediatorImpl implements ChatMediator {

	/**
	 * store user in this list
	 */
	private List<User> users;
	
	/***
	 * constructor
	 */
	public ChatMediatorImpl(){
		this.users=new ArrayList<>();
	}
	
	/***
	 * add a new user into list
	 */
	@Override
	public void addUser(User user){
		this.users.add(user);
	}
	
	/***
	 * send  a message
	 */
	@Override
	public void sendMessage(String msg, User user) {
		for(User u : this.users){
			//message should not be received by the user sending it
			if(u != user){
				u.receive(msg);
			}
		}
	}

}
