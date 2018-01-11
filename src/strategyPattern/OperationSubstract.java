package strategyPattern;
/***
 * 
 * @author Gopal Vaghasiya
 * in this class doOperation() method
 */
public class OperationSubstract implements Strategy{
	   
	/***
	    * 
	    * @param num1
	    * @param num2
	    * @return subtraction
	    */
		@Override
	   public int doOperation(int num1, int num2) {
	      return num1 - num2;
	   }
	}
