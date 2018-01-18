package interpreterPattern;
/***
 * 
 * @author Gopal Vaghasiya
 * in this class main method hold
 */
public class InterpreterPatternClient {
	
	/***
	 * 
	 * @param args
	 *  main method
	 */
	 public static void main(String[] args)
	    {
	        String infix = "a+b*c";
	        /***
	         * object created
	         */
	        InfixToPostfixPattern ip=new InfixToPostfixPattern();
	        
	        /***
	         * call a function and store in string variable
	         */
	        String postfix = ip.conversion(infix);
	        
	        /***
	         * print infix
	         */
	        System.out.println("Infix:   " + infix);
	        
	        /***
	         * print postfix
	         */
	        System.out.println("Postfix: " + postfix);
	        
	        
	   
	   }


}
