package SearchEX;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է�");
		System.out.println("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			do {
				System.out.println("x[ " + i + " ] : ");
				x[i] = sc.nextInt();
			} while(x[i] < x[i - 1]);
		}
		
		System.out.println("�˻��� �� : ");
		int ky = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0) {
			System.out.println("�� ���� ��Ұ� ����");
		} else {
			System.out.println(ky + "��(��) x[ " + idx + " ]�� ����");
		}
	}
}
