package hiding;

public class Mydate {
	private int day;
	private int month;
	private int year;
	
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int Day) {
		if (month == 2) {
			if(Day<1 || Day>29) {
				System.out.println("오류입니다");
			}else {
				this.day = Day;
			}
		}
	}
	
}
