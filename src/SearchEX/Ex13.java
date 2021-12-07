package SearchEX;

import java.util.Scanner;

public class Ex13 {

}

class PhysExamSearch()
{
	static class physData{
		private String name;
		private int height;
		private double vision;
		
		public physData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public static final Comparator<physData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhysData>{
			public int compare(physData d1, physData d2) {
				return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
			}
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			PhysData[] x = {
				new physData("�̳���", 162, 0.3) ,
				new physData("������", 168, 0.4) ,
				new physData("���Ѱ�", 169, 0.8) ,
				new physData("ȫ�ر�", 171, 1.5) ,
				new physData("������", 173, 0.7) ,
				new physData("��ȣ��", 174, 1.2) ,
				new physData("�̼���", 175, 2.0) 
			}
		}
	}
}
