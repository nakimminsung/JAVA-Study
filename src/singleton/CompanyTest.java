package singleton;
/*
 * 싱글톤으로 회사 클래스 구현하기
 * 단계 4. 실제로 사용하는 코드 만들기
 */

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4. 변수의 주소 값비교하기
		// 클래스 이름으로 getIntance() 호출하여 참조 변수에 대입
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		//두 변수가 같은 주소인지 확인
		System.out.println(myCompany1 == myCompany2);
	}

}
