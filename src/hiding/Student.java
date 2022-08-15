package hiding;

public class Student {

	int sudentID;
	private String studentName; // 학생 이름을 프라이빗 변수로 선언
	int grade;
	String adeeress;


public String getStudentName() { //private 변수인 studentName에 접근해 값을 가져오는 public get() 메서드
	return studentName;
	}

public void setStudentName(String studentName) { // private 변수인 studentName에 접근해 값을 지정하는 public set() 메서드
	this.studentName = studentName;
}


}