package test.day0718;

class Test
{
	String name="영자";
	String addr="강남구";
}

/////////
public class Ex7CallBy {
	
	public static void changeInt(int n)
	{
		n=200;
	}
	
	public static void changeString(String s)
	{
		s="happy";
	}
	
	public static void changeArray(int []arr)
	{
		arr[2]=8;
	}
	
	//Test라는 클래스의 레퍼런스를 받아서 주소(addr)만 변경
	public static void changeTest(Test t)
	{
		t.addr="여의도";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//call by value:값이 전달된다
		int n=100;
		String s="Good";
		
		//값이 전달
		changeInt(n);
		changeString(s);
		
		System.out.println(n);
		System.out.println(s);
		
		int []arr= {1,2,3};
		//배열은 타입 상관없이 무조건 주소가 전달되는 레퍼런스 타입이다
		changeArray(arr);//주소가 전달
		for(int a:arr)
			System.out.println(a);
		
		//Test 클래스 생성
		Test t=new Test();
		changeTest(t);//t의 레퍼런스가 전달
		
		System.out.println(t.name+","+t.addr);
	}

}





