package strategyPattern;

public class Main {

	public static void main(String[] args) {
		
		AlgorithmSelector algorithmselector = new AlgorithmSelector();		

//		1 method
		ISort mergsort = new MergeSort();
		algorithmselector.setiSort(mergsort);
		algorithmselector.performSort();
		
		
//		2 method
		algorithmselector.setiSort(new BubbleSort());
		algorithmselector.performSort();
		
		algorithmselector.setiSearch(new LinearSearch());
		algorithmselector.performSearch();
		
		algorithmselector.setiSearch(new BinarySearch());
		algorithmselector.performSearch();
		
		
	}

}
