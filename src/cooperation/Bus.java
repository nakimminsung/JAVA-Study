package cooperation;
// 버스 클래서 구현하기 
// 버스 객체에서는 어떤일이 일어날까?
// 학생 한명이 승차하면 버스 요금을 받고 승객수가 증가하는 버스 클래스를 만들어보자!
public class Bus {
	int busNum;	// 버스 번호
	int passngerCount; // 승객 수
	int money; // 버스 수입
	
	public Bus(int busNum) { // 버스 번호를 대입 받는다 // 버스번호를 매개변수로 받는 생성자
		this.busNum = busNum;	// 위 인스턴스 변수 버스번호에 에 로컬 변수인 버스번호를 대입한다
	}
	
	public void take(int money) { // 승객이 버스에 탄 경우를 구현한 메서드
		this.money += money; // 한명씩 탈때마다 돈이 증가한다
		passngerCount++; // 돈이 증가하면서 인원수도 하나씩 증가한다 
		// 돈이 증가하는 것과 인원수가 증가하는 것을 모두 구현하였기에 더 이상 메서드를 생성하지 않아도 된다.
	}
	
	public void showInfo() { // 버스 정보를 출력하는 메서드
		// 쇼인포 메서드를 호출하면 버스번호와 승객수, 수입을 실행한다
		System.out.println("버스 번호는 "+busNum+"이고, 승객수는" + passngerCount +"명 이며, 수입은 "+ money +"입니다");
	}
}
