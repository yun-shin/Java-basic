import java.util.*;

class CountRunnable implements Runnable{
	public void run() {
		System.out.println("스레드 실행 시작");
		for(int i=1;i<11;i++) {
			if(i%2 == 0)						// i가 짝수일 경우
			System.out.print(i + " ");			// 짝수 출력
		}
		System.out.print("\n" + "스레드 종료");
	}
}

public class print_EvenNumbers {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String anyKey;
		System.out.print("아무 키나 입력>> ");
		scanner.nextLine();
		
		//순서대로 실행되고 이거 콘솔창 실행이라 그냥 스캐너 쓰면 됨
		CountRunnable runnable = new CountRunnable();
		//runnable 객체 만들어서 넘겨주는 방식이니까 우선 만드는게 먼저
		Thread th = new Thread(runnable);
		th.start();
	}
}