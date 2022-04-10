
public class Test {

	
	public static void main(String[] args) {
		
		
		
		
	}
	
	
	
	public void swap(ADTList list, int i, int j) {

		if(i > list.size() || j > list.size()) {
			throw new ListOutOfBoundsException("ERROR: List Out of Bounds Size = " 
					+ list.size() + ", i = " + i + ", j = " + j + ".");
		}
		else {
			String temp = "" + list.get(i);
			list.add(i, list.get(j));
			list.remove(i + 1);
			list.add(j, temp);
			list.remove(j + 1);
		}
		
	}
}
