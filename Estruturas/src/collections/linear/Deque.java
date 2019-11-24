package collections.linear;

public class Deque extends Fila {

	protected void addFirst(Object o) {
		enqueue(o);
	}
	
	protected void delFirst() {
		dequeue();
	}
	
	protected void addLast(Object o) {
		add(o);
	}
	
	protected void delLast() {
		if (inserteds == 0) {
			System.out.println("Empty queue");
			return;
		}
		
		array[inserteds - 1] = null;
		inserteds -= 1;
	}
}
