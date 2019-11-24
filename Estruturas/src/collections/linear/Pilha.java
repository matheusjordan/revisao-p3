package collections.linear;

import collections.BaseLinearStructure;

public class Pilha extends BaseLinearStructure {

	protected void push(Object o) {
		add(o);
	}
	
	protected void pop() {
		if (inserteds == 0) {
			System.out.println("Empty stack");
			return;
		}
		
		array[inserteds - 1] = null;
		inserteds -= 1;
	}

}
