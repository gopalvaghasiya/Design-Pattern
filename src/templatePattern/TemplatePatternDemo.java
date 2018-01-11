package templatePattern;
/***
 * 
 * @author Gopal Vaghasiya
 * it holds main method
 */
public class TemplatePatternDemo {
	/***
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {

		/***
		 * create  a object of cricket through Game interface refrence 
		 */
	      Game game = new Cricket();
	      /***
	       * play() method call
	       */
	      game.play();
	      System.out.println();
	      game = new Football();
	      /***
	       * play() method call
	       */
	      game.play();		
	   }
}