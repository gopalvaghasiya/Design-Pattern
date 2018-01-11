package commandpattern;
/***
 * 
 * @author Gopal Vaghasiya
 * it is hold main method
 */
public class CommandPatternClient {
	
	/***
	 * 
	 * @param args
	 * main method
	 */
	public static void main(String[] args) {
        /***
         * Document class object created
         */
		Document doc = new Document();
        
		/***
		 * ActionOpen object create
		 */
        ActionListenerCommand clickOpen = new ActionOpen(doc);
        /***
         * ActionSave object create
         */
        ActionListenerCommand clickSave = new ActionSave(doc);
        
        /***
         * MenuOptions class object created
         */
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);
        
        /***
         * method call
         */
        menu.clickOpen();
        
        /***
         * method call
         */
        menu.clickSave();
       
        
    }

}
