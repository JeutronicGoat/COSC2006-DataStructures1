public class StudentLinkedList<T> {

	private class StudentNode<T>{
		
		int studentNum;
		double studentMark;

		StudentNode next;
		
		StudentNode(int studentNum, double studentMark){
			this.studentNum = studentNum;
			this.studentMark = studentMark;
		}
		
		StudentNode(int studentNum, double studentMark, StudentNode next){
			this.studentNum = studentNum;
			this.studentMark = studentMark;
			this.next = next;
		}
		
	}
	
//*************************************************************************
	
	private StudentNode head;
	
	StudentLinkedList(){
		head = null;
	}
	
	public void insert(int studentNum, double studentMark) {
		
		StudentNode curr = head;
		StudentNode prev = null;
		
		if(isEmpty())	head = new StudentNode(studentNum, studentMark, null);
		else {
			while(curr.next != null && studentMark <= curr.studentMark) {
				prev = curr;
				curr = curr.next;
			}
			if(curr == head && studentMark > curr.studentMark)	head = new StudentNode(studentNum, studentMark, curr);
			
			else if(curr.next == null && studentMark > curr.studentMark)	prev.next = new StudentNode(studentNum, studentMark, curr);
			
			else if(curr.next == null)	curr.next = new StudentNode(studentNum, studentMark, null);
			
			else	prev.next = new StudentNode(studentNum, studentMark, curr);
		}
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void removeAll() {
		head = null;
	}
	
	public double getMedian() {
		return medianMark(head.next, head.next);
	}
	
	private double medianMark(StudentNode curr, StudentNode prev) {
		
		if(curr.next == null || curr.next.next == null) {
			return prev.studentMark;
		}
		
		curr = curr.next.next;
		prev = prev.next;		
		return medianMark(curr, prev);
		
	}
	
	public void printList() {
		StudentNode curr = head;
		
		while(curr != null) {
			System.out.print(curr.studentMark + " ");
			curr = curr.next;
		}
		System.out.println("");
	}
	
}
