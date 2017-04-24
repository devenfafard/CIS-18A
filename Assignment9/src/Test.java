public class Test
{
	public static void main (String[] args)
	{
		int[] numbers = {7, 5, 4, 6, 7};
		QuickSortWithDisplay sortingMachine = new QuickSortWithDisplay(numbers);
		sortingMachine.sort();
	}
}