package StackEX;

import java.util.Scanner;
import java.util.Stack;

public class StackPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> coincase = new Stack<>();
		int j = 2;
		while(true) {
			System.out.println("1. 동전넣기 2. 동전빼기");
			int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("넣을 동전의 가격 입력 : ");
				int coin = sc.nextInt();
				
				for(int i = 1; i < j; i++) {
						coincase.push(coin);
					if(coincase.size() == 3) {
						break;
					}
				}
			} else if(ch == 2) {
				System.out.println("뺀 동전 : " + coincase.pop());
			}
			System.out.println("남은 동전 : " + coincase);
		}
	}
}
