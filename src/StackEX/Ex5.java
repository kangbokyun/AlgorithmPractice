package StackEX;

public class Ex5 {
	public int indexOf(int x) {
		for(int i = ptr - 1; i >= 0; i--) {
			if(stk[i] == x) {
				return i;
			}
			return -1;
		}
		
	}
	public void clear() {
		ptr = 0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return ptr;
	}
	
	public boolean isEmpty() {
		return ptr <= 0;
	}
	
	public void dump() {
		if(ptr <= 0) {
			System.out.println("������ ����ֽ��ϴ�.");
		} else {
			for(int i = 0; i < ptr; i++) {
				System.out.println(stk[i] + "");
			}
			System.out.println();
		}
	}
}
