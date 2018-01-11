package iteratorPattern;
/***
 * 
 * @author Gopal Vaghasiya
 * in this class implements Container interface
 */
public class CollectionofNames implements Container {
    
     /***
      * define array of name	
      */
	 public String name[]={"Ashwani Rajput", "Soono Jaiswal","Rishi Kumar","Rahul Mehta","Hemant Mishra"}; 
	
	 /***
      * define array of age
      */
	 public int age[]={26, 25,24,25,23}; 
		
	 /***
      * define array of address
      */
	 public String address[]={"New Delhi", "Gaziabad","Rishi Kumar","Rahul Mehta","Hemant Mishra"}; 
	 
	 /***
      * define array of designation
      */
	 public String designation[]={"Java Programmer and Content Writer", "CEO","Programmer and Web Designer","Manager",".Net Trainer"};
		
	/***
	 * return name 
	 */
	@Override
	public Iterator getIterator() {
		
		return new CollectionofNamesIterate() ;
	}
	
	
	/***
	 * 
	 * @author Gopal Vaghasiya
	 * it is implement  Iterator interface
	 */
	private class CollectionofNamesIterate implements Iterator{
		
		int i;
		/***
		 * next elements is available or not
		 */
		@Override
		public boolean hasNext() {
			if (i<name.length){
				return true;
			}
			return false;
		}

		/***
		 * RETURN NEXT NAME
		 */
		@Override
		public Object next() {
			if(this.hasNext()){
	            return name[i++];
			}
		    return null;	
		}
	
	}
}


