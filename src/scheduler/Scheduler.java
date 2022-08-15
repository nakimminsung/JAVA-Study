package scheduler;

public interface Scheduler { // 인터페이스 정의하기
	public void getNextCall(); // 다음 전화를 가져오는 기능
	public void sendCallToAgent(); // 상담원에게 전화를 배분하는 기능

}
