package interfaceex;

public abstract class Calculator implements Calc	{ // 추상클래스
	// 인터페이스에서 선언한 4개 추상 메서드중 abb()와 sbstarct 2개만 구현하여 추상 클래스 생성

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

}


