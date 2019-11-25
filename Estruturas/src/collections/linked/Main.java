package collections.linked;

import collections.GenericValue;

public class Main {
//	public static void main(String[] args) {
//		Fila fila = new Fila();
//		
//		fila.enqueue(new GenericValue("1"));
//		fila.enqueue(new GenericValue("2"));
//		fila.enqueue(new GenericValue("3"));
//		
//		System.out.println(values(fila));
//		System.out.println(fila.size());
//		
//		fila.enqueue(new GenericValue("4"));
//		fila.enqueue(new GenericValue("5"));
//		fila.enqueue(new GenericValue("6"));
//		fila.enqueue(new GenericValue("7"));
//		
//		System.out.println(values(fila));
//		System.out.println(fila.size());
//		
//		fila.dequeue();
//		fila.dequeue();
//		
//		System.out.println(values(fila));
//		System.out.println(fila.size());
//		
//		fila.dequeue();
//		fila.dequeue();
//		fila.dequeue();
//		
//		System.out.println(values(fila));
//		System.out.println(fila.size());
//		
//		fila.dequeue();
//		fila.dequeue();
//		fila.dequeue();
//		
//		System.out.println(values(fila));
//		System.out.println(fila.size());
//	}
//	
//	public static String values(Fila fila) {
//		String txt = "";
//		
//		GenericValue tempValue = fila.getFirst();
//		
//		while(tempValue != null) {
//			txt += tempValue.item;				
//			tempValue = tempValue.next;
//		}
//		
//		return txt;
//	}
	
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.push(new GenericValue("1"));
		pilha.push(new GenericValue("2"));
		pilha.push(new GenericValue("3"));
		
		System.out.println(values(pilha));
		System.out.println(pilha.size());
		
		pilha.push(new GenericValue("4"));
		pilha.push(new GenericValue("5"));
		pilha.push(new GenericValue("6"));
		pilha.push(new GenericValue("7"));
		
		System.out.println(values(pilha));
		System.out.println(pilha.size());
		
		pilha.pop();
		pilha.pop();
		
		System.out.println(values(pilha));
		System.out.println(pilha.size());
		
		pilha.pop();
		pilha.pop();
		pilha.pop();
		
		System.out.println(values(pilha));
		System.out.println(pilha.size());
		
		pilha.pop();
		pilha.pop();
		pilha.pop();
		
		System.out.println(values(pilha));
		System.out.println(pilha.size());
	}
	
	public static String values(Pilha pilha) {
		String txt = "";
		
		GenericValue tempValue = pilha.getFirst();
		while(tempValue != null) {
			txt += tempValue.item;				
			tempValue = tempValue.next;
		}
		
		return txt;
	}
}
