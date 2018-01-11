package visitorPattern;

/***
 * 
 * @author Gopal Vaghasiya
 * in this class implements ComputerPart interface
 */
public class Keyboard implements ComputerPart {

	/***
	 * visit() method call
	 */
	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}