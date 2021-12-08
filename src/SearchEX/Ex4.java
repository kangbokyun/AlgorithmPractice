package SearchEX;

public class Ex4 {
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		while(i < n) {
			if(a[i] == key) {
				return i;
			}
			i++;
		}
		return -1;
	}
}
