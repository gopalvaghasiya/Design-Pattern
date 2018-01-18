package commandpattern;
/***
 * 
 * @author Gopal Vaghasiya
 * it implement clickOpen() and clickSave() method
 *
 */
public class MenuOptions {

	private ActionListenerCommand openCommand;
    private ActionListenerCommand saveCommand;
    
    /***
     * 
     * @param open
     * @param save
     */
    public MenuOptions(ActionListenerCommand open, ActionListenerCommand save) {
        this.openCommand = open;
        this.saveCommand = save;
    }
    /***
     * call execute() method
     */
    public void clickOpen(){
       openCommand.execute();
    }
    
    /***
     * call execute() method
     */
    public void clickSave(){
      saveCommand.execute();
    }

	
}
