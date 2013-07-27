package mytest;

public class MyObject {
	private int identifier;
	private int dummyHashCode;

	public int getDummyHashCode() {
		return dummyHashCode;
	}

	public void setDummyHashCode(int dummyHashCode) {
		this.dummyHashCode = dummyHashCode;
	}

	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}
	
	@Override
	public boolean equals(Object otherObj) {
		if (super.equals(otherObj) == true) { return true; }
		if (otherObj == null || (otherObj instanceof MyObject == false) ) {
			return false;
		}
		MyObject otherMyObj = (MyObject)otherObj;
		if (otherMyObj.getIdentifier() == this.getIdentifier()) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return dummyHashCode;
	}
}
