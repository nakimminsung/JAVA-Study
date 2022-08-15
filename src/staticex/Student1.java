package staticex;
/*
 * 학번을 자동으로 부여하는 프로그램을 완성해보자!
 */
public class Student1 {
	public static int serialNum = 1000; 
	// static변수는 인스턴스 생성과 상관없이 먼저 생성됨 기준 값인 1000을 대입 시킨다
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() { // 생성자 
		serialNum++; // 학생이 생성될때마다 증가
		studentID = serialNum; // 증가된 값을 인스턴스 변수에 대입시킨다
	}
	

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	

}
