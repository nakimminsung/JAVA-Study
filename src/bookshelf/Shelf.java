package bookshelf;

import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf; // 자료를 순서대로 저장할 ArrayList 선언

	public Shelf() {
		shelf = new ArrayList<String>(); // 디폴트 생성자로 Shelf 클래스를 생성하면 ArrayList도 생성된다
	}

	public ArrayList<String> getShelf() { // getShelf() : 저장되어있는 배열 shelf를 반환
		return shelf;
	}

	public int getCount() { // getCount : 배열 shelf에 저장된 요소 개수를 반환
		return shelf.size();
	}
	
	
	
}
