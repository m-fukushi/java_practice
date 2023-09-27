package practice;
import java.util.Optional;

public class Main {
	public static Optional<String> decorate(String s,char c){
		String r;
		if(s == null|| s.length() == 0) {
			r= null;
		}else {
			r = c+s+c;
		}
		return Optional.ofNullable(r);
	}
	
	public static void main(String[] args) throws Exception{
		Optional<String>s = decorate("hoge",'*');
  	    System.out.println(s.orElse("nullのため処理できません"));
		
//		
//		Account ac = new Account("1723950",AccountType.FUTSU);
//		System.out.println(ac.getAccountType());
//		Outer.Inner ic = new Outer.Inner();
//		
//		Pocket<Object> pocket = new Pocket<>();
//		System.out.println("使い捨てのインスタンスを作りpocketに入れます");
//		//匿名クラス
//		pocket.put(new Object() {
//			String innerField;
//			void innerMethod() {
//				System.out.println("匿名クラス");
//			}
//		});
//		
	}
//	ArrayList<Book> list = new ArrayList<>(); 
//	 Book b1 = new Book();
//	 b1.setTitle("Java入門");
//	 b1.setPublishDate(Date.valueOf("2011-10-07"));
//	 b1.setComment("スッキリわかる");
//	 Book b2 = new Book();
//	 b2.setTitle("Python入門");
//	 b2.setPublishDate(Date.valueOf("2019-06-11"));
//	 b2.setComment("カレーが食べたくなる");
//	 Book b3 = new Book();
//	 b3.setTitle("C言語入門");
//	 b3.setPublishDate(Date.valueOf("2018-06-21"));
//	 b3.setComment("ポインタも自由自在");
//	 
//	 list.add(b1);
//	 list.add(b2);
//	 list.add(b3);
//	 
//	 //整列
//	 Collections.sort(list,new TitleComparator());
//	 
//	 for (Book b:list){
//		 System.out.println("書名："+b.getTitle()+"発行日："+b.getPublishDate().toString()+"コメント"+b.getComment());
//	 }
	    
//	}
}
	
