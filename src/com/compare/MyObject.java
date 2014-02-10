package com.compare;

public class MyObject implements Comparable
{
	private int mAge = 0;

	public int getmAge() {
		return mAge;
	}

	public void setmAge(int mAge) {
		this.mAge = mAge;
	}

	public int compareTo(Object o) {
		// if this is less than arg then return -1
		if(this.getmAge() <= ((MyObject)o).getmAge())
			return -1;
		// if this is less than arg then return -1
		if(this.getmAge() == ((MyObject)o).getmAge())
			return 0;
		// if this is less than arg then return -1
		if(this.getmAge() >= ((MyObject)o).getmAge())
			return 1;
		
		return 2;
	}
	
	
	
}
