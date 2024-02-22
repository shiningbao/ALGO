package ex03.useage;

public class Main {

	public static void main(String[] args) {
		
		// 매개변수의 데이터 타입을 생략할 수 있다.
		OperationA operA = (a, b)-> {
			System.out.println("합계 : "+(a+b)); // 실행문이 return 이나 syso 밖에 없으면 {} 도 생략 가능
		
	}; 
	operA.plus(3, 4);
		// 매개변수가 하나일 경우 () 생략 가능
		OperationB operB = a -> {
			System.out.println(a+" 의 제곱은 : "+(a*a));
			
		};
		operB.square(4);
		
		// 매개변수가 없을 경우 생략할 수 있는게 없음
		OperationC operC = ()-> System.out.println("매개변수 없이 동작");
		operC.process();
		// 매개변수 : 1개, 실행문 : 반환문만 존재(return 도 없앨 수 있다.)
		OperationD operD = msg -> msg; 
		String msg = operD.echo("그냥 반환만 한다.");
		System.out.println(msg);
		
			}
	
	
}

	
/*람다식에 활용할 interface*/
interface OperationA{
	void plus(int a, int b);
}
interface OperationB{
	void square(int a);
}
interface OperationC{
	void process();
}
interface OperationD{
	String echo(String msg);
}