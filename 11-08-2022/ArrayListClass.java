import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		// Adding the elements
		list.add(34);
		list.add(16);
		list.add(15);
		list.add(10);
		list.add(59);
		list.add(18);
		
		// Retrieve the elements
		System.out.println("All Elements - " + list);
		
		// Removing the elements
		list.remove(4);
		list.remove(2);
		
		System.out.println("List after remove the elements - " + list);
      
       }
}
		