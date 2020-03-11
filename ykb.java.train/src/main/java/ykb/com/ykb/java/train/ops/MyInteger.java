package ykb.com.ykb.java.train.ops;

public class MyInteger {
	private int iVal;

	public MyInteger(int iVal) {
		super();
		this.iVal = iVal;
	}

	public int getiVal() {
		return iVal;
	}

	public void setiVal(int iVal) {
		this.iVal = iVal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + iVal;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyInteger other = (MyInteger) obj;
		if (iVal != other.iVal)
			return false;
		return true;
	}
	
}
