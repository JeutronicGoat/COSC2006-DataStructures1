
public interface MyListInterface<T> {

	public boolean isEmpty();
	public int size();
	public void add(int position, T o);
	public void remove(int position);
	public void removeAll();
	public T get(int position);
	public void printList();
}
