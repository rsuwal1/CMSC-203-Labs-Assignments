import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	// Empty constructor 
	public TwoDimRaggedArrayUtility()
	{
		
	}
	
	//Receives 2D array and returns the average of its items
	public static double getAverage(double[][] data)
	{
		double total = 0;
		int items = 0;
		for (int i=0; i < data.length; i++)
		{
			for (int j=0; j < data[i].length; j++)
			{
				items++;
				total += data[i][j];
			}
		}
		return total / items;
	}
	
	
	
	// Receives a 2D array and a column index and returns the total of items in the column
	public static double getColumnTotal(double[][] data, int col)
	{
		
		double col_total = 0;
		for (int i=0; i < data.length; i++)
		{
			if (data[i].length > col)
			{
				col_total += data[i][col];
			}
		}
		return col_total;
	}
	
	
	
	// Receives a 2D array and returns the highest in the array
	public static double getHighestInArray(double[][] data)
	{
		double largest = 0;
		for (int i=0; i < data.length; i++)
		{
			for (int j=0; j < data[i].length; j++)
			{
				if (data[i][j] > largest)
					largest = data[i][j];
			}
		}
		return largest;
	}
	
	

	// Finds and returns the highest item in a column
	public static double getHighestInColumn(double[][] data, int col)
	{
		double largest = 0;
		for (int i=0; i < data.length; i++)
		{
			if (data[i].length > col && data[i][col]>largest)
			{
				largest = data[i][col];
			}
		}
		
		return largest;
	}
	
	
	
	// Returns the index of highest item in a column	 
	public static int getHighestInColumnIndex(double[][] data, int col) 
	{
		double largest = 0;		
		int index = 0;
		for (int i=0; i < data.length; i++)
		{
			if (data[i].length > col && data[i][col]>largest)
			{
				largest = data[i][col];
				index = i;
			}
		}
		
		return index;
	}
	
	
	// Finds and returns the highest item in a column
	public static double getHighestInRow(double[][] data, int row)
	{
		double largest = 0;
		for(int i=0; i<data[row].length; i++)
		{
			if (data[row][i] > largest)
				largest = data[row][i];
		}
		
		return largest;
	}
	
	
	// Returns the index of highest item in a row
	public static int getHighestInRowIndex(double[][] data, int row)
	{		
		double largest = 0;		
		int index = 0;
		for(int i=0; i<data[row].length; i++)
		{
			if (data[row][i] > largest)
			{
				largest = data[row][i];
				index  =i;
			}
		}
		
		return index;
	}
	


	// Receives a 2D array and returns the lowest item in the array
	public static double getLowestInArray(double[][] data)
	{
		double smallest = 9999999.0;
		for (int i=0; i < data.length; i++)
		{
			for (int j=0; j < data[i].length; j++)
			{
				if (data[i][j] < smallest)
					smallest = data[i][j];
			}
		}
		return smallest;
	}
	
	
	// Finds and returns the lowest item in a column
	public static double getLowestInColumn(double[][] data, int col)
	{
		double smallest = 9999999.0;
		for (int i=0; i < data.length; i++)
		{
			if (data[i].length > col && data[i][col] < smallest)
			{
				smallest = data[i][col];
			}
		}
		return smallest;
	}
	
	
	// Returns the index of lowest item in a column	
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		double smallest = 9999999.0;
		int index = 0;
		for (int i=0; i < data.length; i++)
		{
			if (data[i].length > col && data[i][col] < smallest)
			{
				smallest = data[i][col];
				index = i;
			}
		}
		return index;
	}
	
	
	// Finds and returns the lowest item in a row
	public static double getLowestInRow(double[][] data, int row)
	{
		double smallest = 9999999.0;
		for(int i=0; i<data[row].length; i++)
		{
			if (data[row][i] < smallest)
				smallest = data[row][i];
		}
		return smallest;
	}
	
	
	// Returns the index of lowest item in a row	
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		double smallest = 9999999.0;
		int index = 0;
		for(int i=0; i<data[row].length; i++)
		{
			if (data[row][i] < smallest)
			{
				smallest = data[row][i];
				index = i;
			}
		}
		return index;
	}
	
	
	// Receives a 2D array and a row index and returns the sum of items in the row
	public static double getRowTotal(double[][] data, int row)
	{
		double rowTotal = 0;
		for(int i=0; i<data[row].length; i++)
		{
			rowTotal += data[row][i];
		}
		return rowTotal;
	}
	
	
	// Receives a 2D array and returns the sum of array elements
	public static double getTotal(double[][] data)
	{
		double total = 0;
		for (int i=0; i < data.length; i++)
		{
			for (int j=0; j < data[i].length; j++)
			{
				total += data[i][j];
			}
		}
		return total;
	}
	
	
	// Read data from a file
	public static double[][] readFile(java.io.File file) throws FileNotFoundException
	{
		Scanner sc = new Scanner(file);
	    int rowIndex = 0;
	    String[][] tempArray = new String[10][]; 
	    
	    // Pass numbers to temporary array as String
	    while (sc.hasNextLine())
	    {
	    	String[] row = sc.nextLine().split(" ");
	    	tempArray[rowIndex] = new String[row.length];
	    	for (int i = 0;i < row.length;i++)
	    	{
	    		tempArray[rowIndex][i]=row[i]; 
	    	}
	    	rowIndex++;
	    }
	    
	   // Create double data array and parse numbers as doubles
	    double[][]saleArray = new double[rowIndex][];
	    for (int i = 0; i < rowIndex;i++)
	    {
	    	saleArray[i]= new double[tempArray[i].length];
	    	for (int j = 0;j < tempArray[i].length;j++)
	    	{
	    		System.out.print(tempArray[i][j] + " ");
	    		saleArray[i][j] = Double.parseDouble(tempArray[i][j]);
	    	}
	    	System.out.println();
	    }
	    
	    sc.close();
	    return saleArray;
	  }

	
	
	// Write data in to a file
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
	{
	    PrintWriter result = new PrintWriter(outputFile);
	    StringBuilder sb = new StringBuilder();
	    
	    for (int i = 0;i < data.length;i++)
	    {
	    	for (int j = 0;j < data[i].length;j++)
	    	{
	    		sb.append(data[i][j]+ " ");
	    	}
	    	sb.append("\n");
	    }
	   
	    result.print(sb.toString());
	    result.close();
	  }

	}