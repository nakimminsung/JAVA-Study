package thisex;

class Person{
	String name;
	int age;
	
	Person(){
		this("이름 없음",1); // this를 사용해 Person(String,int)생성자 호출
	}
	
	Person(String name, int age){ // 위의 Person This의 이름과 숫자를 가져옴
		this.name = name;
		this.age = age;
	}
	
	Person retunItSelf() { // 반환형은 클래스형
		return this;
	}
}

public class CallAnhotherConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person noName = new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person P = noName.retunItSelf(); // this값을 클래스 변수에 대입
		System.out.println(P); // noName.returnitSelf()의 반환 값 출력
		System.out.println(noName); // 참조 변수 출력
	}

}
