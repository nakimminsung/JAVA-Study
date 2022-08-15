package cooperation;

// 학생 클래스 구현하기 
// 이름,학년,가진돈을 맴버 변수로 생성하고
// 버스를 탄다, 지하철을 탄다, 학생의 현재정보를 보여준다를 메서드로 생성한다
public class Student {
	public String studentName; // 학생이름
	public int grade; // 학년
	public int money; // 학생이 가지고 있는 돈
	

	public Student(String studentName, int money) {
		// 학생 이름과 가진 돈을 매개변수로 받는 생성자
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		//학생이 버스를 타면 1000원을 지불하는 기능을 구현한 메서드
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		// 학생이 지하철을 타면 1500원을 지불하는 기능을 구현한 메서드
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		//학생이 택시를 타면 10000원을 지불하는 기능을 구현한 메서드
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "원입니다");
	}
}