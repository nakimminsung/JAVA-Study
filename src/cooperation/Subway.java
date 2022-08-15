package cooperation;
//지하철 클래서 구현하기 
//지하철 객체에서는 어떤일이 일어날까?
//지하철 한명이 승차하면 버스 요금을 받고 승객수가 증가하는 지하철 클래스를 만들어보자!
public class Subway {
	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) { 
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println("현재 지하철의 번호는"+lineNumber+"이고, 승객수는" + passengerCount +"명 이며, 수입은 "+money+"원 입니다");
	}
}
