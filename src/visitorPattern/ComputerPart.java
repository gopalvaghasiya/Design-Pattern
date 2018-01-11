package visitorPattern;
/***
 * 
 * @author Gopal Vaghasiya
 * interface
 */
public interface ComputerPart {
	   public void accept(ComputerPartVisitor computerPartVisitor);
	}
