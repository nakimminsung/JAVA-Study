package staticex;

public class StudentTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(Student1.serialNum); // sriealNum 변수를 직접 클래스 이름으로 참조
		System.out.println(studentLee.studentName+" 학 번 : "+studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(Student1.serialNum); // sriealNum 변수를 직접 클래스 이름으로 참조
		System.out.println(studentSon.studentName+" 학 번 : "+studentSon.studentID);
	}

}
