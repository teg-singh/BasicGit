public class BasicGit {
	public static void main(String[] args) {
		print(20);
	}
	
	public static void print(int a) {
		if(a < 1) return;
		print(a - 1);
		System.out.println(a);
	}
}
