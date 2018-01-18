package commandpattern;
/***
 * 
 * @author gopal Vaghasiya
 * it is implements ActionListenerCommand interface
 */
public class ActionOpen implements ActionListenerCommand{
	
	private Document doc;
	 
    public ActionOpen(Document doc) {
        this.doc = doc;
    }
    
    /***
     * it is call open() method
     */
    @Override
    public void execute() {
        doc.open();
    }

}
