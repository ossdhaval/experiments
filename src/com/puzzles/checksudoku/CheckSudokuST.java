package com.puzzles.checksudoku;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CheckSudokuST 
{
	
	public static void main(String[] args)
	{
		int[][] sudoku = {{7,3,5,6,1,4,2,9,8},
							{8,9,6,2,7,3,4,1,5},
							{4,2,1,9,8,5,6,3,7},
							{9,6,4,5,2,7,3,8,1},
							{5,8,7,1,3,6,9,4,2},
							{3,1,2,4,9,8,7,5,6},
							{2,7,3,8,4,1,5,6,9},
							{1,5,9,3,6,2,8,7,4},
							{6,4,8,7,5,9,1,2,3}
							};
		
/*		for(int i=0; i<=8; i++)
		{
			for(int j=0; j<=8; j++)
			{
				System.out.print(sudoku[i][j]);
			}
			System.out.println("\n");
		}*/
		
		
		/* loop through all rows and check uniqueness. Exit
		 * with message if not unique.*/
		for(int cur_index=0; cur_index<=8; cur_index++)
		{
			// get row as an array
			
			// check uniqueness of array
		}
		
		
		/*loop through all columns and check for uniqueness. Exit
		 * with message if not unique. */
		for(int cur_index=0; cur_index<=8; cur_index++)
		{
			// get column as an array
			
			// check uniqueness of array
		}
		
		
		/*loop through all sub-area and check for uniqueness. Exit
		 * with message if not unique.*/
		for(int cur_index=0; cur_index<=8; cur_index++)
		{
			// get sub-area as an array
			
			// check uniqueness of array
		}
		
		// if we reach here that mean sudoku is correct. exit with message.
		
	}
	
	public static boolean isUnique(int[] array)
	{
		List linked_array = new LinkedList(Arrays.asList(array));
		for(int cur_index = 0; cur_index<linked_array.size(); cur_index++)
		{
			if(linked_array.lastIndexOf(linked_array[cur_index])!= cur_index)
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	 * returns an array of integer representing <br/>
	 * a given column of a 2D array
	 * @param aArray 2D array
	 * @param aCol column to be used
	 * @return single dimensional array representing column
	 */
	public static int[] getColumnAsArray(int[][] aArray, int aCol)
	{
		int[] retArray = null;
		for(int i=0; i<=8; i++)
		{
			retArray[i]=aArray[i][aCol];
		}
		return retArray;
	}
	
	
	
	/**
	 * returns a single dimentional array if provided with a 2D array <br/>
	 * Tranversing is done through row by row.
	 * @param aArray 2D array
	 * @return single dimensional array
	 */
	
	public static int[] get2DasArray(int[][] aArray)
	{
		
	}

}
