package QueueEX;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int N = 10;
		int[] a = new int[N];
		int cnt = 0;
		int retry;
		
		System.out.println("���� �Է�");
		
		do {
			System.out.printf("%d��° ���� : ", cnt + 1);
			a[cnt++ % N] = sc.nextInt();
			
			System.out.println("��� ��? : 1. ���� 2. ����");
			retry = sc.nextInt();
		} while(retry == 1);
		
		int i = cnt - N;
		if(i < 0) {
			i = 0;
		}
		for( ; i < cnt; i++) {
			System.out.printf("%2d��° ���� : %d\n", i + 1, a[i % N]);
		}
	}
}
