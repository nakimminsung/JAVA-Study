package test.day0712;

public class Ex1Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=5;
		//단항일경우는 전치든 후치든 결과가 같다
		++a;//a=a+1, a+=1 와 같다
		b++;
		System.out.println(a+","+b);//6,6
		
		int c,d;
		c=++a*3;//a가 먼저 증가후 곱한다,c=21
		d=b++*3;//먼저 곱한후 b가 증가된다,d=18
		System.out.printf("%d,%d,%d,%d\n",a,b,c,d);
		a=b=c=d=3;
		d=b++ + ++c*++a;
		System.out.println(d);//19
		
		a=3;
		System.out.println(a++);//3,출력후 증가,메모리엔 4가 들어있다
		System.out.println(++a);//5,먼저 증가후 출력
		
	}

}
