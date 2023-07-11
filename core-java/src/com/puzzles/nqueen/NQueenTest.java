package com.puzzles.nqueen;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NQueenTest 
{
	public NQueens nq;
	
	@Before
	public void methodSetup()
	{
		
	}
	
	@BeforeClass
	public static void classSetup()
	{
		
	}
	
	@After
	public void methodTearDown()
	{
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<1;j++)
				{
					NQueens.mSetQueens[i][j]=0;
				}
		}
	}
	
	@AfterClass
	public static void classTearDown()
	{
		
	}
	
	@Test
	public void testCheckRowFalse()
	{
		/*assertEquals("failed",0,0);*/
		NQueens.mBoard[0][0]=1;
		NQueens.mBoard[1][2]=1;
		NQueens.mSetQueens[2][0]=3;

		assertFalse("failed", NQueens.checkRow(3));
	}

	
	@Test
	public void testCheckRowTrue()
	{
		/*assertEquals("failed",0,0);*/
		NQueens.mBoard[0][0]=1;
		NQueens.mBoard[1][2]=1;
		NQueens.mSetQueens[2][0]=3;

		assertTrue("failed", NQueens.checkRow(4));
	}
	
	@Test
	public void testCheckColumnTrue()
	{
		NQueens.mSetQueens[4][1]=5;
		
		assertTrue("This is a failure", NQueens.checkColumn(4));
		
	}
	
	@Test
	public void testCheckColumnFalse()
	{
		NQueens.mSetQueens[4][1]=5;
		
		assertFalse("This is a failure", NQueens.checkColumn(5));
		
	}

	@Test
	public void testCheckUpperDiagonalsLeft()
	{
		NQueens.mSetQueens[1][0]=4;
		NQueens.mSetQueens[1][1]=4;
		
		assertFalse("this is a failure", NQueens.checkUpperDiagonals(5, 5));
	}

	@Test
	public void testCheckUpperDiagonalsLeftTrue()
	{
		NQueens.mSetQueens[1][0]=4;
		NQueens.mSetQueens[1][1]=4;
		
		assertTrue("this is a failure", NQueens.checkUpperDiagonals(5, 6));
	}
	
}
