package SearchEX;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력");
		System.out.println("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			do {
				System.out.println("x[ " + i + " ] : ");
				x[i] = sc.nextInt();
			} while(x[i] < x[i - 1]);
		}
		
		System.out.println("검색할 값 : ");
		int ky = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0) {
			System.out.println("그 값의 요소가 없음");
		} else {
			System.out.println(ky + "은(는) x[ " + idx + " ]에 있음");
		}
	}
}
