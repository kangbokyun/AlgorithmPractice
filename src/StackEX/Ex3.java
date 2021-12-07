package StackEX;

public class Ex3 {
	public int pop() throws EmptyIntStackException {
		if(ptr <= 0) {
			throw new EmptyIntStackException(); 
		}
		return stk[--ptr];
	}
}
