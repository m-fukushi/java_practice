package practice;
import java.io.IOException;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) throws IOException{
//    	FileReader fr = new FileReader("rpgdata.csv");
//    	Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(fr);
//    	for(CSVRecord r: records) {
//    		String name = r.get(0);
//    		String hp = r.get(1);
//    		String mp = r.get(2);
//    		System.out.println(name+"/"+hp+"/"+mp);
//    	}
//    	fr.close();
    	
    	//プロパティファイルを読み取る
//    	Reader fr = new FileReader("rpgdata.properties");
//    	Properties p = new Properties();
//    	p.load(fr);
//    	String name = p.getProperty("heroName");
//    	String strHp = p.getProperty("heroHp");
//    	//数字として使う場合、要変換
//    	int hp = Integer.parseInt(strHp);    	
//    	System.out.println("勇者の名前:"+name);
//    	System.out.println("勇者のHP:"+strHp);
//    	
//    	fr.close();
    	//プロパティファイルへの書き込み
//    	Writer fw = new FileWriter("rpgdata.properties");
//    	Properties p = new Properties();
//    	p.setProperty("heroName", "アサカ");
//    	p.setProperty("heroHｐ", "62");
//    	p.setProperty("heroMp", "45");
//    	p.store(fw, "勇者の情報");
//    	fw.close();
    	
    	//ResourseBundleを用いたファイルの読み取り
    	ResourceBundle rb = ResourceBundle.getBundle("workspace\\practice\\practice\\rpgdata");
    	String heroName = rb.getString("heroName");
    	System.out.println("勇者の名前:"+heroName);
    }
}


	
