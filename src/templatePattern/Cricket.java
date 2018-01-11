package templatePattern;
/***
 * 
 * @author Gopal Vaghasiya
 * it holds endPlay() ,  initialize() and startPlay() method
 */
public class Cricket extends Game {

	   @Override
	   void endPlay() {
	      System.out.println("Cricket Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("Cricket Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("Cricket Game Started. Enjoy the game!");
	   }
	}
