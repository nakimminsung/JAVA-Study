package test.day0714;

import java.util.Scanner;
/*
 *  문제:    찾을이름입력
 *           이
 *           0:이영자
 *           4:이진
 *           5:이효리
 *           총 3명 검색
 *           
 *           손
 *           
 *           '손' 으로 시작하는 멤버는 없어요!
 *           
 *           a.startsWith('손')
 */
public class Ex9Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"이영자","강호동","유재석","강소라",
				"이진","이효리","우영우","우지원","유민",
				"박나래"};
		String searchName;		
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("검색할 이름 입력");
		searchName=sc.nextLine();
		
		for(int i=0;i<names.length;i++)
		{
			if(names[i].startsWith(searchName))
			{
				cnt++;
				System.out.println(i+":"+names[i]);
			}
		}
		
		if(cnt==0)
			System.out.println("\'"+searchName+"\' 로 시작하는 멤버는 없어요!");
		else
			System.out.println("총 "+cnt+"명 검색");
	}

}











