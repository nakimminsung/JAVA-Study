package test.day0715;

import java.util.Random;

public class Ex1Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열에 1~45 사이의 난수를 발생시켜 넣기
		int []lotto=new int[6];
		Random r=new Random();
		
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=r.nextInt(45)+1;
			//중복처리-같은숫자가 이전배열번지에 있을경우
			//다시 구한다
			for(int j=0;j<i;j++)
			{
				if(lotto[i]==lotto[j])
				{
					i--;//증감식 i++ 로 이동하므로
					break;
				}
			}			
		}
		
		//정렬
		for(int i=0;i<lotto.length-1;i++)
		{
			for(int j=i+1;j<lotto.length;j++)
			{
				if(lotto[i]>lotto[j])
				{
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		System.out.println("** 로또 숫자 출력 **");
		for(int a:lotto)
			System.out.printf("%4d",a);
	}

}






