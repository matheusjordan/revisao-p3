package collections.linked;

import collections.BaseLinkedStruture;
import collections.GenericValue;

public class Fila extends BaseLinkedStruture {
	
	protected void enqueue(GenericValue o) {
		this.add(o);
	}
	
	protected void dequeue() {
		if (first == null) {
			System.out.println("Empty list");
			return;
		}
		
		first = first.next;
		inserteds -= 1;
	}
	
	protected GenericValue getFirst() {
		return first;
	}
}
