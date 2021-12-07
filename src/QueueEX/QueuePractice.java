package QueueEX;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueuePractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;

		Queue<Integer> waitting = new LinkedList<Integer>();
		
		while(true) {
			System.out.println("1. 번호표뽑기 2.입장하기");
			int ch = sc.nextInt();
	
			
			if(ch == 1) {
				waitting.offer(i);
				System.out.println("받은 번호표 : " + waitting + "번");
				i++;
			} else {
				System.out.println(waitting.poll() + "번 입장");
			}
		}
	}
}
