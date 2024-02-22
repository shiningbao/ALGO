package ex02.inter;

public class Main {

	public static void main(String[] args) {
		
		// 람다식을 사용하려면 인터페이스가 1개의 추상메서드만 있어야 한다. 
		NormalInter inter = new NormalInter() {
			@Override
			public void sayMsg(String msg) {}
			@Override
			public int operation(int a, int b) {return 0;}
		};
		// 람다식 활용
		LambdaInter lambda = (int a, int b)-> {
				return a+b;
		};
		
		int result = lambda.operation(3, 4);
		System.out.println(result);
	}
}


