import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate1 {
	public static void main(String[]args)
	{
		List<Integer> Even = new ArrayList<Integer>();
		Even.add(2);
	    Even.add(0);
	    Even.add(4);
	    Even.add(8);  
	    Even.add(12);
	    Even.add(4);
	    Even.add(14);
	    Even.add(6);
	    Even.add(10);
	    Even.add(12);
	    Even.add(8);
	    
	    System.out.println("List of Even numbers:"+Even);
	    Set<Integer> EvenWithoutDuplicates= new LinkedHashSet<Integer>(Even);
	    Even.clear();
	    Even.addAll(EvenWithoutDuplicates);
	    System.out.println("list of Even without duplicates:"+Even); 
	}
}