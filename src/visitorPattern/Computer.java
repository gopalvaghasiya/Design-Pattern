package visitorPattern;
/***
 * 
 * @author Gopal Vaghasiya
 *	in this class implements ComputerPart interface
 */
public class Computer implements ComputerPart {
	
	   ComputerPart[] parts;

	   /***
	    * constructor
	    */
	   public Computer(){
	      parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};		
	   } 


	   /***
	    * call accept() and visit method
	    */
	   @Override
	   public void accept(ComputerPartVisitor computerPartVisitor) {
	      for (int i = 0; i < parts.length; i++) {
	         parts[i].accept(computerPartVisitor);
	      }
	      computerPartVisitor.visit(this);
	   }
	}
