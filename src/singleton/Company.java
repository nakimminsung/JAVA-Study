package singleton;
/*
 * 싱글톤으로 회사 클래스 구현하기
 * 단계 1. 생성자를 private으로 만들기
 * 단계 2. 클래스 내부에서 static으로 유일한 인스턴스 생성하기
 * 단계 3. 외부에서 참조할 수 있는 public 메서드 만들기
 */
public class Company {
	// 2. 인스턴스 생성하기
	private static Company instance = new Company(); // 유일하게 생성한 인스턴스
	
	// 1. 프라이빗 생성자 만들기
	private Company() {}
	
	// 3. public 메서드 만들기
	public static Company getInstance() {
		if(instance==null) {
			instance = new Company();
		}
		return instance;
	}
}
