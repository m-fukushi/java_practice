package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) throws Exception{
//		FuncList fl = new FuncList();
//		Func1 fc1 = FuncList::isOdd;
//		Func2 fc2 = fl::passCheck;
		
//		Func1 fc1 = (int x) -> {return (x % 2 == 1);};
		List<String> names = new ArrayList<String>();
		names.add("菅原拓真");
		names.add("湊雄輔");
		names.add("朝香あゆみ");
		names.add("大江岳人");
		List<String> names4 = names.stream().filter(name ->name.length() <=4).collect(Collectors.toList());
		for(String s : names4) {
			System.out.println(s+"さん");
		}
		
		
//		IntPredicate fc1 = (int x) -> {return (x % 2 == 1);};
//		Func2 fc2 = (int point, String name) ->{
//		    return name + "さんは" + ( point > 65 ? "合格" : "不合格" );
//		  };
//		
//		//関数インタフェース
//	
//		System.out.println(fc1.test(2));
//
//		String st = fc2.passCheck(75, "ダイス");
//		System.out.println(st);
	}
}
	
