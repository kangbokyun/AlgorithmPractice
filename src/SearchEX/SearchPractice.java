package SearchEX;

import java.util.Scanner;

public class SearchPractice {
	public static void main(String[] args) {
		String[] search = new String[100];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < search.length; i++) {
			search[i] += Integer.toString(i);
		}
		System.out.print("�˻��� ���� : ");
		int no = sc.nextInt();
		
		for(int i = 0; i < search.length; i++) {
			if(search[i].contains(no+"")) {
				String strno = search[i].split("null")[1];
				System.out.println("�˻��� ���� �� ��� : " + strno);
			}
		}
	}
}
