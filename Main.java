
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		LinkedList list = new LinkedList();

		try {
			File f = new File("input.txt");
			Scanner s = new Scanner(f);
			
			while (s.hasNextLine()) {
				int value = Integer.parseInt(s.nextLine().trim());
				list.insert(value);
			}
			s.close();
					
		}catch (FileNotFoundException e) {
			System.out.println("input.txt not found.");
			return;
		}
		
		list.printList();
		
		list.insert(35);
		list.printList();
		
		boolean deleted = list.delete(50);
		if (deleted ) {
			System.out.println("Succesfully deleted 50.");
		} else {
			System.out.println("50 not found in list.");
		}
		list.printList();
		
		
	}

}
