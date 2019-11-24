package collections.linear;

import collections.BaseLinearStructure;

public class Fila extends BaseLinearStructure {
	
	protected void enqueue(Object o) {
		this.add(o);
	}
	
	protected void dequeue() {
		if (inserteds == 0) {
			System.out.println("Empty list!");
			return;
		}
		
		array[0] = null;
		cameToFirst();
		inserteds -= 1;
	}
	
	private void cameToFirst() {
		Object[] tempArray = new Object[array.length];
		
		for (int i = 1; i <= inserteds; i++) {
			tempArray[i -1] = array[i];
		}
		
		array = tempArray;
	}
	
}
