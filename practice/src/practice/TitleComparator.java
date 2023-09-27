package practice;

import java.util.Comparator;

public class TitleComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO 自動生成されたメソッド・スタブ
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
