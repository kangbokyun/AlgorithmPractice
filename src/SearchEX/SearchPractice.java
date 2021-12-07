package SearchEX;

import java.util.Scanner;

public class SearchPractice {
	public static void main(String[] args) {
		String[] search = new String[100];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < search.length; i++) {
			search[i] += Integer.toString(i);
		}
		System.out.print("검색할 숫자 : ");
		int no = sc.nextInt();
		
		for(int i = 0; i < search.length; i++) {
			if(search[i].contains(no+"")) {
				String strno = search[i].split("null")[1];
				System.out.println("검색한 값이 들어간 결과 : " + strno);
			}
		}
	}
}
