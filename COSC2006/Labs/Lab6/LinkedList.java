public class LinkedList<T> {
	
	private class Node<T> {

		Object item;
		
		Node next;
	
	
		public Node(Object item) {
			this.item = item;
		}
	
		public Node(Object item, Node next) {
			this.item = item;
			this.next = next;
		}

	}
	
//*************************************************************************************

	private Node head;
	
	public LinkedList(){
		
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(String s) {
		head = new Node(s, head);
	}
	
	public void addLast() {
		
	}
	
	public void deleteFirst() {
	
		if(isEmpty()) throw new ItemNotFoundException("UH OH");
		
		Node curr = head;
		Node prev = null;
		
		while(curr != null && curr.item != item) {
			prev = curr;
			curr = curr.next;
		}
		
		if(curr == null) throw new ItemNotFoundException("Double UH OH");
		if(prev != null) {
			prev.next = curr.next;
		}
		else {
			head = curr.next;
		}
	}

	public void deleteLast() {
	
	}

}