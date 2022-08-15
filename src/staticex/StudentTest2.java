package staticex;
/*
 * 실제로 학생이 생성될때마다 증가된 다른 학번을 가지는지 확인해보자!
 */
public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 studentLee = new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName+"학번"+studentLee.studentID);
		
		Student1 studentKim = new Student1();
		studentKim.setStudentName("김흥국");
		System.out.println(studentKim.serialNum);
		System.out.println(studentKim.studentName+"학번"+studentKim.studentID);
	}

}
