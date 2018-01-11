package mementoPattern;
import java.util.ArrayList;
import java.util.List;
/***
 * 
 * @author Gopal Vaghasiya
 * 
 */
public class CareTaker {
   /***
    * ArrayList define
    */
	private List<Memento> mementoList = new ArrayList<Memento>();

	/***
	 * add a state
	 * @param state
	 */
   public void add(Memento state){
      mementoList.add(state);
   }

   /***
    * get a state
    * @param index
    * @return
    */
   public Memento get(int index){
      return mementoList.get(index);
   }
}