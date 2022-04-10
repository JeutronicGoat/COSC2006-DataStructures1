
public class DLinkedList<T extends Comparable> {

	private class Node<T>{
		
		Object item;

		Node prev;
		Node next;
		
		Node(Object item){
			this.item = item;
		}
		
		Node(Object item, Node prev, Node next){
			this.item = item;
			this.prev = prev;
			this.next = next;
		}
		
	}
	
//*************************************************************************
	
	private Node dummy;
	
	DLinkedList(){
		dummy = new Node(null);
		dummy.next = dummy;
		dummy.prev = dummy;
	}
	
	public boolean isEmpty() {
		return dummy.next == dummy;
	}
	
	public void removeAll() {
		dummy.next = dummy;
		dummy.prev = dummy;
	}
	
}
