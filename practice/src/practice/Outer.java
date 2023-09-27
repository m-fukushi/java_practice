package practice;

public class Outer {
	int outerField;
	static int outerStaticField;
	int outerMember =2;
	
	void outerMethod() {
		int a=10;
		//ローカルクラス
		class LCInner{
			public void localMethod() {
				System.out.println("innerMethodです");
				System.out.println("outerMember"+a);
			}			
		}
		LCInner ic = new LCInner();
		ic.localMethod();
		
	}
	//メンバクラス
	static class Inner{
		void innerMethod() {
			//staticな外部クラスメンバのみ利用可
			outerStaticField =10;
		}
		void outerMethod() {
		 Inner ic = new Inner();
		}
	}
	 class NsInner{
		void NsinnerMethod() {
			//staticな外部クラスメンバのみ利用可
			outerStaticField =10;
		}
		void NsOuterMethod() {
			Outer o = new Outer();
			Outer.NsInner oi = o.new NsInner();
		}
	}
}
