package visitorPattern;
/***
 * 
 * @author Gopal Vaghasiya
 * this class hold main method
 */
public class VisitorPatternDemo {
	   /***
	    * main method
	    * @param args
	    */
	   public static void main(String[] args) {
		   /***
		    * Computer class object created
		    */
	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	   }
	}
