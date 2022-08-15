package staticex;
/*
 * 학생 두명을 생성하고 시리얼 넘버가 증가 했을때 두 인스턴스에서 증가된 값이 공유되는지 확인해보자
 */

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentLee = new Student();
		studentLee.setStudentName("이을용");
		// 이을용이라는 새로운 학생 생성
		
		System.out.println(studentLee.serialNum); // serialNum 변수의 초기값 출력
		Student.serialNum++;
		
		Student studentKim = new Student();
		studentKim.setStudentName("김민성");
		// 김민성이라는 새로운 학생 생성
		
		System.out.println(studentKim.serialNum);
		System.out.println(studentLee.serialNum);
		// 증가된 serialNum 출력
	}
}
