import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner in;
		try {
			in = new Scanner(new File("src/test1.txt"));
			int studentNum;
			double studentMark;
			
			StudentLinkedList list = new StudentLinkedList();
			
			while(in.hasNext()) {
				studentNum = in.nextInt();
				studentMark = in.nextDouble();
				list.insert(studentNum, studentMark);
				list.printList();
			}
			
			System.out.println();
			System.out.print("The median of the list is: " + list.getMedian());
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("The Fil was not found!!");
		}
		
		
	}
}
