package com.puzzles.nqueen;

public class NQueens {
	
	static int[][] mBoard = new int[8][8];
	static int[][] mSetQueens = new int[8][2];
	
	public NQueens()
	{
		
	}
	
	public static void main(String[] args)
	{
		
		for(int i=0; i<8; i++)
		{
			if(!checkRow(i))
				continue;
			for(int j=0; j<8; j++)
			{
				if(!checkColumn(j))
					continue;
				if(!checkUpperDiagonals(i,j))
					continue;
				putQueen(i,j);
			}
		}
		
		showBoard();
	}
	
	static boolean checkRow(int aRowNum)
	{
		for(int k=0; k<8; k++)
		{
			if(mSetQueens[k][0] == aRowNum)
				return false;
		}
		return true;
	}
	
	static boolean checkColumn(int aColNum)
	{
		for(int k=0; k<8; k++)
		{
			if(mSetQueens[k][1] == aColNum)
				return false;
		}
		return true;
	}
	
	static boolean checkUpperDiagonals(int aRowNum, int aColNum)
	{
		int i = aRowNum, j=aColNum;
		
		// check upper-left diagonal for any existing queens
		while(i >= 0 && j >= 0 )
		{
			for(int k=0; k<8; k++)
			{
				if(i==mSetQueens[k][0] && j==mSetQueens[k][1])
				{
					return false;
				}
			}
			i--;
			j--;
		}
		
		// check upper-right diagonal for any existing queens
		i = aRowNum; 
		j=aColNum;
		while(i >= 0 && j < 8 )
		{
			for(int k=0; k<8; k++)
			{
				if(i==mSetQueens[k][0] && j==mSetQueens[k][1])
				{
					return false;
				}
			}
			i--;
			j++;
		}
		
		// return true if we did not find queen in any of the upper diagonals
		return true;
	}
	
	public static void putQueen(int aRow, int aCol)
	{
		// find empty slot in mSetQueens
		int i=0;
		while(mSetQueens[i][0] != 0)
			i++;
		mSetQueens[i][0] = aRow;
		mSetQueens[i][1] = aCol;
	}
	
	public static void showBoard()
	{
		for (int i=0; i<8; i++)
		{
			mBoard[mSetQueens[i][0]][mSetQueens[i][1]] = 1;
		}
		
		for (int i=0; i<8; i++)
		{
			for (int j=0; j<8; j++)
			{
				System.out.print(mBoard[i][j]);
			}
			System.out.println("\n");
		}
	}

}