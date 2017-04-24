import javax.swing.*;
public class QuickSortWithDisplay extends QuickSort 
{
	public QuickSortWithDisplay(int[] arr) 
	{
		super(arr);
	}

	void display(int[] arr)
	{
		String dis = "";
		for (int i = 0; i < arr.length; i++)
		{
			dis += arr[i] + " ";
		}
		
		JOptionPane.showMessageDialog(null, "Here's the array after sorting:\n" + dis);
	}
}
