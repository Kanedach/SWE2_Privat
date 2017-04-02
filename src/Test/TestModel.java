package Test;

public class TestModel {
	
	private int value;
	
	public TestModel() {
		value = 0;
	}
	
	public int count(){
		this.value ++;
		return value;
	}
	
	public int getValue(){
		return value;
	}

}
