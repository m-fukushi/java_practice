package practice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // List1の作成（仮のデータ）
        List<Map<String, String>> list1 = new ArrayList<>();
        Map<String, String> map1 = new HashMap<>();
        map1.put("key1", "1");
        map1.put("key2", "2");
        map1.put("key3", "3");
        map1.put("key4", "4");
        list1.add(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("key1", "1");
        map2.put("key2", "2");
        map2.put("key3", "3");
        map2.put("key4", "4");
        list1.add(map2);
        
        Map<String, String> map3 = new HashMap<>();
        map3.put("key1", "1");
        map3.put("key2", "2");
        map3.put("key3", "2");
        map3.put("key4", "4");
        list1.add(map3);


        // List2の作成
        List<Map<String, Object>> list2 = new ArrayList<>();

        // ①key1, key2, key3, key4に対する値の組み合わせが同じ行をカウントする
        Map<String, Integer> countMap = new HashMap<>();

        for (Map<String, String> map : list1) {
            String keyCombination = map.get("key1") + map.get("key2") + map.get("key3") + map.get("key4");
//            countMap.put(keyCombination, countMap.getOrDefault(keyCombination, 0) + 1);
            //key項目の組み合わせのmapを作る
            //countMap.getOrDefault(keyCombination, 0)→getOrDefaultで、countMapのキーに合致する値を取得して加算
            //そのキーが存在しない場合は0を返す
            //countMap.put("1234", countMap.get（"1234"）+ 1);
            countMap.put(keyCombination, countMap.getOrDefault(keyCombination, 0) + 1);
        }

        // ②key1, key2, key3, key4に対する値の組み合わせが重複しないようにMapを保持する
        Map<String, Map<String, String>> uniqueMap = new HashMap<>();

        for (Map<String, String> map : list1) {
            String keyCombination = map.get("key1") + map.get("key2") + map.get("key3") + map.get("key4");
            //putIfAbsent:keyに値を持っていない場合にセットする
            uniqueMap.putIfAbsent(keyCombination, map);
        }

        // ③②のMapはkey1, key2, key3, key4に対する値の組み合わせごとに①のカウント値をkey5の値に保持する
        for (Map.Entry<String, Map<String, String>> entry : uniqueMap.entrySet()) {
            String keyCombination = entry.getKey();
            Map<String, String> map = entry.getValue();
            int count = countMap.getOrDefault(keyCombination, 0);

            Map<String, Object> result = new HashMap<>(map);
            result.put("key5", count);
;
            list2.add(result);
        }

        // 結果の出力
        for (Map<String, Object> result : list2) {
            System.out.println(result);
        }
    }
}


	
