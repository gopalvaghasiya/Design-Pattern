package iteratorPattern;
/***
 * 
 * @author Gopal Vaghasiya
 * in this class main method hold
 */
public class IteratorPatternDemo {
	/***
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
	    /***
	     * create  a object of  CollectionofNames
	     */
		CollectionofNames cmpnyRepository = new CollectionofNames();
	      
		  /***
		   * iterator through for each 
		   */
	      for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){
	          String name = (String)iter.next();
	          System.out.println("Name : " + name);
	       } 	
	      
	}
}
