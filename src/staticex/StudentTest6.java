package staticex;

public class StudentTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student3 studentLee = new Student3();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.getStudentName());
		System.out.println(studentLee.getSerialNum());
		System.out.println(studentLee.cardNumber);
		
		
		Student3 studentKim = new Student3();
		studentKim.setStudentName("김민성");
		System.out.println(studentKim.getStudentName() + "님의 \n학번" + studentKim.getSerialNum()+"\n카드번호"+studentKim.cardNumber);
	}

}
