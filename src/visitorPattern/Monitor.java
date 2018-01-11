package visitorPattern;
/***
 * 
 * @author Gopal Vaghasiya
 * in this class implement ComputerPart 
 */
public class Monitor implements ComputerPart {

	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      computerPartVisitor.visit(this);
	   }
	}
