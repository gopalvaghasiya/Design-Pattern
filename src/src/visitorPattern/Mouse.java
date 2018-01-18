package visitorPattern;

/***
 * 
 * @author Gopal Vaghasiya
 * this class implement ComputerPart 
 */
public class Mouse implements ComputerPart {

	   /***
	    * visit() method call
	    */
	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}
