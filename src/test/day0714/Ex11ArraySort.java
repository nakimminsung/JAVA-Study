package test.day0714;

public class Ex11ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []data= {5,3,1,2,4};
		//selection sort
		for(int i=0;i<data.length-1;i++)//기준
		{
			for(int j=i+1;j<data.length;j++)
			{
				if(data[i]>data[j])//오름차순(내림차순 <)
				{
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		}
		
		//출력
		for(int a:data)
			System.out.printf("%4d",a);
	}

}
