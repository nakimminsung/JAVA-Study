package staticex;
/*
 * 
 */

public class StudentTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 studentLee = new Student2(); // 객체 생성
		studentLee.setStudentname("이지원"); // 새로운 객체 학생에 이름 지정
		
		// serialNum 값을 가져오기위해 get()메서드를 클래스 이름으로 직접 호출
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.getStudenName() + " 학번 : "+ studentLee.studentID);

		
		Student2 studentSon = new Student2();
		studentSon.setStudentname("손흥민");
		
		// serialNum 값을 가져오기위해 get()메서드를 클래스 이름으로 직접 호출
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.getStudenName()+ " 학번 : "+studentSon.studentID);
	}

}
