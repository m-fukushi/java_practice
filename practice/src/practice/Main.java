package practice;
import java.util.TimeZone;


public class Main {

	public static void main(String[] args) throws Exception{
//		//デフォルトロケールの取得
//		//Locale loc = Locale.getDefault();
//		Locale loc = Locale.getDefault();
//		System.out.println(loc.getCountry()+"-"+loc.getLanguage());
//		String now = (new SimpleDateFormat()).format(new Date());
//		if(loc.getLanguage().equals("ja")) {
//			System.out.println("現在の時刻は"+now);
//		}
//		else {
//			System.out.println("Current time is"+now);
//		}
//		
		TimeZone tz = TimeZone.getDefault();
		System.out.print("現在のタイムゾーン：");
		System.out.println(tz.getDisplayName());
		if(tz.useDaylightTime()) {
			System.out.println("夏時間を採用しています");
		}
		else {
			System.out.println("夏時間を採用していません");
		}
		System.out.println("世界標準時との時差は");
		System.out.println(tz.getRawOffset()/3600000+"時間");
	}
}
	
