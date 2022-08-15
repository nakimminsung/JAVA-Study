package hiding;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		
//		studentLee.studentName = "이상원"; // 오류발생 
		studentLee.setStudentName("이상원"); // setStudentName()메서드를 활용해 private 변수에 접근 가능
		//스튜던트테스트 클래스에서 세터로 이름 대입 후 스튜던트 클래스 세터네임으로 대입 후 프라이빗 스튜던트 네임으로 대입된다.
		
		System.out.println(studentLee.getStudentName());
	}

}
