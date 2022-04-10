
public class Test {
	public static void main(String[] args) {
		
		
		CircleQueue q = new CircleQueue(10);
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);
		q.enqueue(9);
		
		q.dequeue();
		q.dequeue();
		
		q.enqueue(10);
		q.enqueue(11);
		
		q.print();
		
		
		
	}
}
