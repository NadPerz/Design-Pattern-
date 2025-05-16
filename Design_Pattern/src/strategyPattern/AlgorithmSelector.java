package strategyPattern;

public class AlgorithmSelector {
	ISearch iSearch;
	ISort iSort;
	
	
	public void setiSearch(ISearch iSearch) {
		this.iSearch = iSearch;
	}
	
	
	public void setiSort(ISort iSort) {
		this.iSort = iSort;
	}
	
	
	
	void performSort () {
		
		this.iSort.sort();
	}
	
	void performSearch () {
		
		this.iSearch.search();
	}
	
	
	
}
