package test.day0712;

import java.util.Scanner;

public class Ex11Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score;
		String grade;
		//점수를 입력후 점수에 따라 "A","B","C","D","F" 를 구한후
		//예: 98점은 A학점입니다
		//변수=조건1?참일때값:조건2?:참일때값:조건3?참일때값:거짓일때값
		System.out.println("점수 입력");
		score=sc.nextInt();
		grade=score>=90?"A":score>=80?"B":score>=70?"C":score>=60?"D":"F";
		System.out.println(score+"점은 "+grade+"학점입니다");
	}

}
