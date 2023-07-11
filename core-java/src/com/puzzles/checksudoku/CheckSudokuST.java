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
			int[] tempArray = null;
			tempArray = sudoku[cur_index];
			// check uniqueness of array
			if(!isUnique(tempArray))
			{
				System.out.println("row "+cur_index+" not unique");
				return;
			}
		}
		
		
		/*loop through all columns and check for uniqueness. Exit
		 * with message if not unique. */
		for(int cur_index=0; cur_index<=8; cur_index++)
		{
			// get column as an array
			int[] tempArray = null;
			tempArray = getColumnAsArray(sudoku, cur_index);
			// check uniqueness of array
			if(!isUnique(tempArray))
			{
				System.out.println("col : "+cur_index+" not unique");
				return;
			}
			
		}
		
		
		/*loop through all sub-area and check for uniqueness. Exit
		 * with message if not unique.*/
		for(int cur_row_index=0; cur_row_index<=6; cur_row_index=cur_row_index+3)
		{
			for(int cur_col_index=0; cur_col_index<=6; cur_col_index=cur_col_index+3)
			{
				// get sub-area as an array
				int[] tempArray = null;
				tempArray = getSub3x3Array(sudoku, cur_row_index, cur_col_index);
				// check uniqueness of array
				if(!isUnique(tempArray))
				{
					System.out.println("sub Array : "+cur_row_index+","+cur_col_index+" : not unique");
					return;
				}
			}
		}
		
		// if we reach here that mean sudoku is correct. exit with message.
		System.out.println("Correct sudoku");
	}
	
	
	/**
	 * returns true if single dimensional array contains unique</br>
	 * members. Else false.
	 * @param array
	 * @return boolean
	 */
	public static boolean isUnique(int[] array)
	{
		List linked_array = new LinkedList(Arrays.asList(array));
		for(int cur_index = 0; cur_index<linked_array.size(); cur_index++)
		{
			if(linked_array.lastIndexOf(linked_array.toArray()[cur_index])!= cur_index)
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
		int[] retArray = new int[10];
		for(int i=0; i<=8; i++)
		{
			retArray[i]=aArray[i][aCol];
		}
		return retArray;
	}
	
	
	
	/**
	 * returns a single dimentional array if provided with a 2D array <br/>
	 * Tranversing is done row by row.
	 * @param aArray 2D array
	 * @param aRow row number of the element that represents upper left corner of 3x3 sub array
	 * @param aCol col number of the element that represents upper left corner of 3x3 sub array
	 * @return single dimensional array
	 */
	
	public static int[] getSub3x3Array(int[][] aArray, int aRow, int aCol)
	{
		int[] retSubArray = new int[10];
		int index = 0;
		for(int i=aRow;i<(aRow+3);i++)
		{
			for(int j=aCol; j<(aCol+3); j++)
			{
				retSubArray[index]=aArray[i][j];
				index++;
			}
		}
		
		return retSubArray;
	}
}
