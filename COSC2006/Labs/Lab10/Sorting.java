
public class Sorting {
	
	public static void main(String[] args) {
		int[] a = new int[20];
		
		for(int i =  0; i < a.length; i++) {
			a[i] = ((int) (Math.random() * (50000 - -50000 + 1)) + -50000);
		}
		
		for(int i =  0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		QuickSort(a, 0, a.length);
		
		for(int i =  0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	static void QuickSort(int[] array, int start, int end) {
		
		if(start >= end) return;
		int pivot = Partition(array, start, end);
		QuickSort(array, start, pivot);
		QuickSort(array, pivot + 1, end);
		
	}
	
	static int Partition(int[] array, int start, int end) {
		
		int pivot = start;
		int last = start;
		int u = pivot + 1;
		
		while(u < end) {
			if(array[u] < array[pivot]) {
				Swap(array, ++last, u);
			}
			u++;
		}
		Swap(array, last, pivot);
		return last;
	}

	static void Swap(int[] array, int last, int pivot) {
		
		int temp = array[last];
		array[last] = array[pivot];
		array[pivot] = temp;
	}
}
