package practice;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws IOException {

      System.out.println("1円以上のアイテム一覧表を表示します");
      ArrayList<Item> items = ItemsDAO.findByMinimumPrice(1);
      for (Item item : items) {
        System.out.printf("%10s%4d%4d", item.getName(), item.getPrice(), item.getWeight());
      }
    
 }
	   
}
