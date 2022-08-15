package staticex;
/*
 * serialNum변수를 프라이빗으로 선언하고, 이 변수에 대한 get, set메서드 생성
 */
public class Student2 {
	private static int serialNum = 1000; // 프라이빗 변수 생성
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2() {
		// 스튜던트 시리엄 넘버가 하씩 증가하면서 스튜던트 아이디로 대입된다
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudenName() { // 스튜던트 네임의 get()메서드
		return studentName;
	}
	
	public void setStudentname(String name) { // 스튜던트 네임의 set()메서드
		studentName = name;
	}
	
	public static int getSerialNum() { // serialNum의 get() 메서드
		int i = 10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {  // serialNum의 set() 메서드
		Student2.serialNum = serialNum; 
	}
}
