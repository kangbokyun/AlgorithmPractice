package StackEX;

public class Ex1 {
	private int max;
	private int ptr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {	}
	}
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {
			
		}
	}
	
	public Ex1(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		} catch(OutOfMemoryError e) {
			max = 0;
		}
	}
}
