package collections;

public abstract class BaseLinearStructure {
	protected static final int INCREASE_FACTOR = 2;
	
	protected Object[] array;
	protected int inserteds;
	
	public BaseLinearStructure() {
		array = new Object[3];
		inserteds = 0;
		
	}
	
	protected void add(Object o) {
		if (isArrayFull()) {
			expand();
		}
			
		array[inserteds] = o;
		inserteds += 1;
	}
	
	public Object[] getAll() {
		return array;
	}
	
	public int size() {
		return inserteds;
	}
	
	private boolean isArrayFull() {
		return array.length == inserteds;
	}
	
	private void expand() {
		Object[] tempArray = new Object[array.length * INCREASE_FACTOR];
		
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}
		
		array = tempArray;
	}
}
