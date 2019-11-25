package collections;

public abstract class BaseLinkedStruture {
	protected GenericValue first;
	protected int inserteds;

	public BaseLinkedStruture() {
		inserteds = 0;
	}
	
	protected void add(GenericValue o) {
		if (first == null) {
			first = o;
		} else {
			GenericValue tempValue = first;
			
			while (tempValue.next != null) {
				tempValue = tempValue.next;
			}
			
			tempValue.next = o;
		}
		
		inserteds += 1;
	}
	
	public int size() {
		return inserteds;
	}
}
