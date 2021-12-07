package SearchEX;

import java.util.Scanner;

public class Ex1 {
	static int seqSearch(int[] a, int n, int key) {
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				return i;
			}
		}
		return -1;
	}
//	static int seqSearch(int[] a, int n, int key) {
//		int i = 0;
//		while(true) {
//			if(i == n) {
//				return -1;
//			}
//			if(a[i] == key) {
//				return i;
//			}
//			i++;
//		}
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("x[ " + i + " ] : ");
			x[i] = sc.nextInt();
		}
		System.out.println("검색할 값 : ");
		int ky = sc.nextInt();
		int idx = seqSearch(x, num, ky);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없음");
		} else {
			System.out.println(ky + "은(는) x[ " + idx + " ]에 있음");
		}
	}
}
