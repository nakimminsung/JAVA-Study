package test.day0719;

public class Student {
	private String name;
	private String hakbun;
	private int score;
	
	public Student()
	{}
	
	public Student(String name)
	{
		this.name=name;
	}
	
	public Student(String name,String hakbun,int score)
	{
		this.name=name;
		this.hakbun=hakbun;
		this.score=score;
	}
	
	public static void showTitle()
	{
		System.out.println("이름\t학번\t점수\t학점");
		System.out.println("--------------------------------");
	}
	
	public void writeStudent()
	{
		System.out.println(name+"\t"+hakbun+"\t"+score+"\t"+getGrade());
	}
	public char getGrade()
	{
		//score 점수에 따라 A,B,C,D,F학점 구해서 리턴
		char grade=score>=90?'A':score>=80?'B':score>=70?'C':score>=60?'D':'F';
		return grade;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setHakbun(String hakbun)
	{
		this.hakbun=hakbun;
	}
	public void setScore(int score)
	{
		this.score=score;
	}
	
	public void setData(String name,String hakbun,int score)
	{
		this.name=name;
		this.hakbun=hakbun;
		this.score=score;
	}
}







