package SearchEX;

public class Ex14 {
	static class GenericClass<T>{
		private T xyz;
		public GenericClass(T t) {
			this.xyz = t;
		}
		T getXyz() {
			return xyz;
		}
	}
	
	public static void main(String[] args) {
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);
	}
}
