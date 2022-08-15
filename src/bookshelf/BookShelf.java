package bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) { // 배열에 요소 추가
		shelf.add(title); // 배열에 요소 추가한다 (추가 = add)
	}

	@Override
	public String deQueue() { // 맨 처음 요소를 배열에서 삭제하고 반환
		return shelf.remove(0); // 0번째 배열의 요소를 삭제한다 (삭제 = remove)
	}

	@Override
	public int getSize() { // 배열 요소 개수 반환
		return getCount(); // 리턴값을 shelf클래스에 있는 getCount값으로 받는다
	}
	

}
