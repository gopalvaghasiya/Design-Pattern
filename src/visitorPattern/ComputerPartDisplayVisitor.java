package visitorPattern;
/***
 * 
 * @author Gopal Vaghasiya
 * this class implements ComputerPartVisitor interface
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	   /***
	    * print computer
	    */
	   @Override
	   public void visit(Computer computer) {
	      System.out.println("Displaying Computer.");
	   }

	   /***
	    * print mouse
	    */
	   @Override
	   public void visit(Mouse mouse) {
	      System.out.println("Displaying Mouse.");
	   }

	   /***
	    * print keyboard
	    */
	   @Override
	   public void visit(Keyboard keyboard) {
	      System.out.println("Displaying Keyboard.");
	   }

	   /***
	    * print monitor
	    */
	   @Override
	   public void visit(Monitor monitor) {
	      System.out.println("Displaying Monitor.");
	   }
	}
