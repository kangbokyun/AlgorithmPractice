package QueueEX;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Ex2 s = new Ex2(64);
		
		while(true) {
			System.out.println("현재 데이터 수 : " + s.size() + " / " + s.capacity());
			System.out.println("1. 인큐 2. 디큐 3. 피크 4. 덤프 5. 종료");
			
			int menu = sc.nextInt();
			if(menu == 0) {
				break;
			}
			int x;
			switch(menu) {
			case 1: System.out.println("데이터 : "); x = sc.nextInt(); try {s.enque(x);}catch(Ex2.OverflowIntQueueException e) {System.out.println("큐 가득 참");}
			case 2: try {x = s.deque(); System.out.println("디큐 데이터 : " + x + "임");}catch(Ex2.EmptyIntQueueException e) {System.out.println("큐가 빔");} break;
			case 3: try {x = s.peek(); System.out.println("피크 데이터 : " + x + "임");}catch(Ex2.EmptyIntQueueException e) {System.out.println("큐가 빔");} break;
			case 4: s.dump(); break;
			}
		}
	}
}
