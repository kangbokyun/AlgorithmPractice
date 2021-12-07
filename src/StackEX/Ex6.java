package StackEX;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("���� ������ �� : " + s.size() + " / " + s.capacity());
			
			System.out.println("1. Ǫ�� 2. �� 3. ��ũ 4. ���� 5. ����");
			
			int menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
			
			int x;
			switch(menu) {
			case 1:
				System.out.println("������ : ");
				x = sc.nextInt();
				try {
					s.push(x);
				} catch (Exception e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
			case 2:
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				} catch (Exception e) {
					System.out.println("������ ��");
				}
				break;
			case 3:
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "��");
				} catch (Exception e) {
					System.out.println("������ ����ֽ��ϴ�.");
				}
				break;
			case 4:
				s.dump();
				break;
			}
		}
	}
}
