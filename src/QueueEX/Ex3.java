package QueueEX;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex2 s = new Ex2(64);
		
		while(true) {
			System.out.println("���� ������ �� : " + s.size() + " / " + s.capacity());
			System.out.println("1. ��ť 2. ��ť 3. ��ũ 4. ���� 5. ����");
			
			int menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
			int x;
			switch(menu) {
			case 1: System.out.println("������ : "); x = sc.nextInt(); try {s.enque(x);}catch(Ex2.OverflowIntQueueException e) {System.out.println("ť ���� ��");}
			case 2: try {x = s.deque(); System.out.println("��ť ������ : " + x + "��");}catch(Ex2.EmptyIntQueueException e) {System.out.println("ť�� ��");} break;
			case 3: try {x = s.peek(); System.out.println("��ũ ������ : " + x + "��");}catch(Ex2.EmptyIntQueueException e) {System.out.println("ť�� ��");} break;
			case 4: s.dump(); break;
			}
		}
	}
}
