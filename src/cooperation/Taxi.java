package cooperation;
/*
 * Edward 학생이 늦잠을 자서 택시를 타고 학교에 가게 되었습니다. 택시 요금은 10,000원 지불했습니다
 * 이 과정을 구현해 보시오
 */

public class Taxi {
	String taxinum;
	int money;
	
	public Taxi(String taxinum){
		this.taxinum = taxinum;
	}
	
	public void take(int money) {
		this.money = money;
	}
	
	public void showInfo() {
		System.out.println("택시 번호는"+taxinum+"이고 금액은"+money+"입니다");
	}
}
