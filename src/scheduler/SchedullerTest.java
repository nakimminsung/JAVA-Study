package scheduler;

import java.io.IOException;

public class SchedullerTest {

	public static void main(String[] args) throws IOException { // 문자를 입력받는 system.in.red()를 사용하려면 IOException에서 오류를
																// 처리해야한다
		System.out.println("전화 상담 할당 방식을 선택하세요");
		System.out.println("R : 차례대로 한명씩 할당");
		System.out.println("L : 쉬고있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");

		int ch = System.in.read(); // 할당 방식을 입력받아 ch변수에 대입
		Scheduler scheduler = null;

		if (ch == 'R' || ch == 'r') {
			scheduler = new RooundRobin(); // 입력 받은 값이 R 또는 r 이면 RoundRobin 클래스 생성
		}

		else if (ch == 'L' || ch == 'l') {
			scheduler = new LeastJob(); // 입력 받은 값이 L 또는 l 이면 LeastJob 클래스 생성
		}

		else if (ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation(); // 입력 받은 값이 P 또는 p 이면PriorityAllocation 클래스 생성
		}

		else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		// 어떤 정책인가와 상관없이 인터페이스에 선언한 메서드 호출
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
