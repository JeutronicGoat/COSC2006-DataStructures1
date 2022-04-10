
public class CircleQueue {
	
	private final int MAX_SIZE;
	private int[] queue;
	private int front, back;
	
	CircleQueue(int size){
		MAX_SIZE = size;
		queue = new int[MAX_SIZE];
		front = 0; 
		back = -1;
	}
	
	public boolean isEmpty() {
		return mod(back + 1) == front;
	}
	
	public boolean isFull() {
		return mod(back + 2) == front;
	}
	
	public int size() {
		return mod(back - front + 1);
	}
	
	public void enqueue(int value) {
		if(isFull()) throw new CircleQueueException("Queue is full!!!!");
		
		back = mod(back + 1);
		queue[back] = value;
	}
	
	public void dequeue() {
		if(isEmpty()) throw new CircleQueueException("Queue is empty!!!!");
		
		front = mod(front + 1);
	}
	
	public void print() {
		for(int i = 0; i < MAX_SIZE; i++)
			System.out.print(queue[i] + " ");
	}
	
	public int mod(int value) {
		return (value >= MAX_SIZE) ? (value - MAX_SIZE) : value;
	}
}
