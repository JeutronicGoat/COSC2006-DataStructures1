
public class ADTList<T> implements MyListInterface<T>{

	private int maxSize;
	private int size = 0;
	private Object[] list;
	
	
	public ADTList(int maxSize) {
		this.maxSize = maxSize;
		
		list = new Object[size];
	}
	
	public ADTList() {
		this(25);
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}



	@Override
	public void add(int position, T o) {
		
		if(size == maxSize) {
			throw new ListOutOfBoundsException("ERROR: No more size in list");
		}
		else{
			
			Object curr = this.get(position - 1);
			list[position - 1] = o;
			Object next = this.get(position);
			
			for(int i = position; i < size; i++) {
				
				list[position] = curr;
				
			}
			
		}
	}



	@Override
	public void remove(int position) {
		
	}



	@Override
	public void removeAll() {
		list = new Object[size];
		size = 0;
	}



	@Override
	public T get(int position) {
		return (T) list[position - 1];
	}



	@Override
	public void printList() {
		System.out.print("[");
		for(int i = 0; i < size; i++) {
			if(i == size -1) {
				System.out.print(list[i] + "]");
			}
			else {
				System.out.print(list[i] + ", ");
			}
		}
	}
	
	
}
