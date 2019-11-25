package collections.linked;

import collections.BaseLinkedStruture;
import collections.GenericValue;

public class Pilha extends BaseLinkedStruture {

	protected void push(GenericValue o) {
		add(o);
	}
	
	protected void pop() {
		
		GenericValue tempValue = first;
		
		while(tempValue.next != null) {			
			if (tempValue.next.next == null) {
				tempValue.next = null;
				break;
			}
			tempValue = tempValue.next;
		}
		
		if (first == null || inserteds == 0) {
			first = null;
			System.out.println("Empty Stack");
			return;
		}
		inserteds -= 1;
	}
	
	protected GenericValue getFirst() {
		return first;
	}
}
