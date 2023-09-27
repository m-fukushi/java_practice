package practice;

//2-1
//金庫クラスに格納するインスタンスの型は開発時には未定
public class StrongBox<E> {
	//2-2 鍵の種類を示すフィールド
//	final double PADLOCK =1024;
//	final double BUTTON =10000;
//	final double DIAL = 30000;
//	final double FINGER =1000000;
	//getカウンタ
	private long getCnt =0;
	private KeyType keyType;
	private E data;

	
	//鍵の種類を受け取るコンストラクタ
	public StrongBox(KeyType ktype) {
		this.data = (E) ktype;
	}
	//
	public void put(E d) {
		this.data = d;
	}
	public E get(){
		this.getCnt++;
		
	switch(this.keyType) {
		case PADLOCK:
		if(getCnt <1024) return null;
		break;
		case BUTTON:
		if(getCnt <10000) return null;
		break;
		
		case DIAL:
		if(getCnt <30000) return null;
		break;
		
		case FINGER:
		if(getCnt <10000) return null;
		break;	
	}
	this.getCnt = 0;
		return this.data;
	}
//2-2 

	
}
