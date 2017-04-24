abstract class QuickSort 
{
	private int[] values;
	private int length;
	
	public QuickSort(int[] arr)
	{
		this.values = arr;
		length = values.length;
	}
		
	final void sort()
	{
		quicksort(0, length - 1);
		display(values);
	}
	
	void quicksort(int _low, int _hi)
	{
		int low = _low, hi = _hi;
		int pivot = values[low + (hi-low)/2];
		
		while (low <= hi)
		{
			while (values[low] < pivot)
			{
				low++;
			}
			while (values[hi] > pivot)
			{
				hi--;
			}
			
			if (low <= hi)
			{
				int temp = values[low];
				values[low] = values[hi];
				values[hi] = temp;
				low++;
				hi--;
			}
		}
		
		if (_low < hi)
			quicksort(_low, hi);
		if (low < _hi)
			quicksort(low, _hi);
	}
	
	abstract void display(int[] arr);
}