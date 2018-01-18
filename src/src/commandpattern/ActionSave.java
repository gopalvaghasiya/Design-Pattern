package commandpattern;
/***
 * 
 * @author Gopal Vaghasiya
 * it is implements ActionListenerCommand interface
 */
public class ActionSave implements ActionListenerCommand{
	
	private Document doc;
	 
    public ActionSave(Document doc) {
        this.doc = doc;
    }
    
    /***
     * override a method and call save() method
     */
    @Override
    public void execute() {
        doc.save();
    }

}
