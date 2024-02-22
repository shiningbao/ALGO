package ex01.basic;

public class Main {

	public static void main(String[] args) {
		// 인터페이스를 강제로 객체화 하려고 할 때 생성되는 것이 익명 객체
		Runnable task1 = new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <=3; i++) {
					System.out.println("익명 객체 thread run-"+i);
				}
				
			}
		};
		new Thread(task1).start();
		
		// 람다식으로 익명객체 생성
		Runnable task2 = ()-> {
				for (int i = 1; i <=3; i++) {
					System.out.println("람다식 객체 thread run-"+i);
				}
		};
		new Thread(task2).start();
	}

}
