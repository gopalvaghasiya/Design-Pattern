package templatePattern;
/***
 * 
 * @author Gopal Vaghasiya
 * it is abstract class 
 */
public abstract class Game {
	   abstract void initialize();
	   abstract void startPlay();
	   abstract void endPlay();

	   //template method
	   public final void play(){

	      //initialize the game
	      initialize();

	      //start game
	      startPlay();

	      //end game
	      endPlay();
	   }
	}
