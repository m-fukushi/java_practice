package practice;

import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
	  System.out.println("止めるには「STOP」を入力してください");
	  System.out.println("カウントダウンを開始します");
//	  for(int i =9; i>=0; i--) {
//		  System.out.print(i+"..");
//		  try {
//			  TimeUnit.SECONDS.sleep(1);
//		  }catch(InterruptedException e) {
//			  ;
//		  }
//	  }
	  Thread t = new PrintingThread();
	  t.start();
	  String input = new Scanner(System.in).nextLine();
	  System.out.println("入力文字列:"+input);
	  System.out.println("停止処理は未作成です");
  }	   
}
