public class TEN {
	public static void main(String[] args) {
		print(10);
	}
	
	public static void print(int a) {
		if(a > 1) print(a - 1);
		System.out.println(a);
	}
}
