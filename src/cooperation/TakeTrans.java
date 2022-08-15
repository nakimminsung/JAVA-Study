package cooperation;
/*
 * Student, Bus, Subway 클래스를 기반으로 학생이 버스나 지하철을 탔을대 상황을 구현 해보자!
 * 두 학생 James와 Tomas가 있습니다. 이 두 학생은 각각 버스아 지하처을 한번씩 타고 학교에 갑니다 
 * 두 학생이 교통수단을 이용한 후 각자가 가진 돈의 변화와 버스, 지하철 수입의 합을 알아봅시다
 */

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJames = new Student("Jame",5000);
		Student studentTomas = new Student("Tomas",1000);
		Student studentEdward = new Student("Edward",200000);
		
		Bus bus100 = new Bus(100); // 노선 번호가 100번인 버스 생성
		studentJames.takeBus(bus100); // 제임스는 노선번호가 100번인 버스에 탓다!
		studentJames.showInfo(); // James의 정보 출력
		bus100.showInfo(); // 버스 100번에 대한 정보 출력
		
		Subway subway = new Subway("지하철 1호선"); // 지하철 1호선 생성
		studentTomas.takeSubway(subway);  // 토마스는 지하철을 탓다(=지하철은 1호선이다)
		studentTomas.showInfo(); // Tomas의 정보 출력
		subway.showInfo(); // 지하철의 정보 출력
		
		Taxi taxi = new Taxi("서울 아 3456"); // 택시 번호 생성
		studentEdward.takeTaxi(taxi); // 에드워드가 택시를 탓다
		studentEdward.showInfo(); // 에드워드에 대한 정보 출력
		taxi.showInfo(); // 택시의 정보 출력
	}

}
