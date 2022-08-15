package staticex;

/*
 * 예제에서 사용할 static변수는 sreialNum
 * 변수의 값은 학생이 생성될때마다 순서대로 증가
 * 증가된 값을 각 학생의 학번에 대입해주면 학생에게 새로운 학번이 부여된다
 */

public class Student {
	public static int serialNum = 1000; 
	// static변수는 인스턴스 생성과 상관없이 먼저 생성됨 기준 값인 1000을 대입 시킨다
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
	
}
