package interfaceex;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if (num2 != 0)
			return num1 / num2;
		else
			return Calc.ERROR;   // num2가 0 즉, 나누는 수가 0인 경우에 대해 오류 반환
	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다"); // CompleteCalc에서 추가로 구현한 메서드
	}

	@Override
	public void description() { 
		// 디폴트 메서드 description()을 CompleteCalc클래스에서 원하는 기능으로 재정의
		// TODO Auto-generated method stub
		super.description();
	}
	
	
	
}
