package SearchEX;

import java.util.Arrays;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] x = {
				"abstract", "assert", "boolean","break", "byte", "case", "catch", "char", "class", "const", "continue", "default",
				"do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import",
				"instanceof", "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return",
				"short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try",
				"void", "volatile", "while" };
	
		System.out.println("원하는 키워드 검색 : ");
		String ky = sc.next();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0) {
			System.out.println("그 값의 요소가 없음");
		} else {
			System.out.println(ky + "은(는) x[ " + idx + " ]에 있음");
		}
	}
}
