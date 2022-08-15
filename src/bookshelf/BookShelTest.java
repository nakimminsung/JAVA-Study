package bookshelf;

public class BookShelTest {

	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		
		// 순서대로 요소를 추가한다
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		
		// 입력 순서대로 요소를 꺼내서 출력한다
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
