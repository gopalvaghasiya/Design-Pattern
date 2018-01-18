package strategyPattern;
/***
 * 
 * @author Gopal Vaghasiya
 * in this class executeStrategy() method
 */
public class Context {
	   private Strategy strategy;
	   /***
	    * constructor
	    * @param strategy
	    */
	   public Context(Strategy strategy){
	      this.strategy = strategy;
	   }

	   /***
	    * 
	    * @param num1
	    * @param num2
	    * @return doOperation() method
	    */
	   public int executeStrategy(int num1, int num2){
	      return strategy.doOperation(num1, num2);
	   }
	}
