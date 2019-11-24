package collections.linear;

public class Main {
//	public static void main(String[] args) {
//		Fila fila = new Fila();
//
//		fila.enqueue("1");
//		fila.enqueue("2");
//		fila.enqueue("3");
//		fila.enqueue("4");
//		
//		System.out.println(fila.size());
//		System.out.println(stringValues(fila));
//		
//		fila.enqueue("5");
//		fila.enqueue("6");
//		fila.enqueue("7");
//		
//		System.out.println(fila.size());
//		System.out.println(stringValues(fila));
//		
//		fila.dequeue();
//		fila.dequeue();
//		
//		System.out.println(fila.size());
//		System.out.println(stringValues(fila));
//	
//		fila.dequeue();
//		fila.dequeue();
//		fila.dequeue();
//		fila.dequeue();
//		
//		System.out.println(fila.size());
//		System.out.println(stringValues(fila));
//		
//		fila.dequeue();
//		fila.dequeue();
//		
//		System.out.println(fila.size());
//		System.out.println(stringValues(fila));
//	}
//	
//	private static String stringValues(Fila fila) {
//		String text = "";
//		
//		for (Object o : fila.getAll()) {
//			if (o == null) break;
//			text += o;
//		}
//		
//		return text;
//	}
	
/* =================================================
 * =========== PILHAS - ESTRUTUA DE DADOs ==========
 * =================================================
 * */

//	public static void main(String[] args) {
//		Pilha pilha = new Pilha();
//	
//		pilha.push("1");
//		pilha.push("2");
//		pilha.push("3");
//		pilha.push("4");
//		
//		System.out.println(pilha.size());
//		System.out.println(stringValues(pilha));
//		
//		pilha.push("5");
//		pilha.push("6");
//		pilha.push("7");
//		
//		System.out.println(pilha.size());
//		System.out.println(stringValues(pilha));
//		
//		pilha.pop();
//		pilha.pop();
//		
//		System.out.println(pilha.size());
//		System.out.println(stringValues(pilha));
//	
//		pilha.pop();
//		pilha.pop();
//		pilha.pop();
//		pilha.pop();
//		
//		System.out.println(pilha.size());
//		System.out.println(stringValues(pilha));
//		
//		pilha.pop();
//		pilha.pop();
//		
//		System.out.println(pilha.size());
//		System.out.println(stringValues(pilha));
//	}
//
//	private static String stringValues(Pilha pilha) {
//		String text = "";
//		
//		for (Object o : pilha.getAll()) {
//			if (o == null) break;
//			text += o;
//		}
//		
//		return text;
//	}

	public static void main(String[] args) {
		Deque deque = new Deque();
		
		deque.addFirst("1");
		deque.addFirst("2");
		deque.addFirst("3");
		deque.addFirst("4");
		
		System.out.println(deque.size());
		System.out.println(stringValues(deque));
		
		deque.addFirst("5");
		deque.addFirst("6");
		deque.addFirst("7");
		
		System.out.println(deque.size());
		System.out.println(stringValues(deque));
		
		deque.delFirst();
		deque.delFirst();
		
		System.out.println(deque.size());
		System.out.println(stringValues(deque));
	
		deque.delFirst();
		deque.delFirst();
		deque.delFirst();
		deque.delFirst();
		
		System.out.println(deque.size());
		System.out.println(stringValues(deque));
		
		deque.delFirst();
		deque.delFirst();
		
		System.out.println(deque.size());
		System.out.println(stringValues(deque));
		
		deque.addLast("1");
		deque.addLast("2");
		deque.addLast("3");
		deque.addLast("4");
		
		System.out.println(deque.size());
		System.out.println(stringValues(deque));
		
		deque.addLast("5");
		deque.addLast("6");
		deque.addLast("7");
		
		System.out.println(deque.size());
		System.out.println(stringValues(deque));
		
		deque.delLast();
		deque.delLast();
		
		System.out.println(deque.size());
		System.out.println(stringValues(deque));
	
		deque.delLast();
		deque.delLast();
		deque.delLast();
		deque.delLast();
		
		System.out.println(deque.size());
		System.out.println(stringValues(deque));
		
		deque.delLast();
		deque.delLast();
		
		System.out.println(deque.size());
		System.out.println(stringValues(deque));
	}

	private static String stringValues(Deque deque) {
		String text = "";
		
		for (Object o : deque.getAll()) {
			if (o == null) break;
			text += o;
		}
	
		return text;
	}
}
