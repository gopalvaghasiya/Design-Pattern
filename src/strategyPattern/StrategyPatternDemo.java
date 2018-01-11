package strategyPattern;

/***
 * 
 * @author Gopal Vaghasiya
 * in this class hold main method
 */
public class StrategyPatternDemo {
		/***
		 * main method
		 * @param args
		 */
	   public static void main(String[] args) {
	      /***
	       * Context class object created
	       */
		   Context context = new Context(new OperationAdd());
		   
		/***
		 * executeStrategy() method call
		 */
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
	      /***
	       * Context class object created
	       */
	      context = new Context(new OperationSubstract());		
	      /***
			 * executeStrategy() method call
			 */
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
	      /***
	       * Context class object created
	       */
	      context = new Context(new OperationMultiply());		
	      /***
			 * executeStrategy() method call
			 */
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	   }
	}
