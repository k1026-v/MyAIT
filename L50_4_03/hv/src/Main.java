import java.util.*;

public class Main {
    public static void main(String[] args) {

        /* Дана Map map, написать метод, который вернет мапу, такую, что если в исходной map есть ключи ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b в качестве значения. Если нет, ничего не менять
Примеры:
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}
Дан массив строк (не пустой). Написать метод, возвращающий мапу Map где каждая строка является ключем, а значением является true если строка в массиве встречается больше одного раза и false, если только один раз.
Примеры:
wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
Дан список имен, где некоторые имена повторяются. Написать метод,который по имени вернет количество вхождений этого имени в список.
Пример: nameToNumberOccurence(List list, String name)
Vasia -> 3*/

        System.out.println("Hello world!");
      List <String> nameList= Arrays.asList("Bob", "Garry", "Ewa", "Bob", "Ewa", "Bob");
       /*int b= nameToNumberOccurence(nameList,"Bob");
        System.out.println("Bob: "+b);
        int g= nameToNumberOccurence(nameList,"Garry");
        System.out.println("Garry: "+g);
        int e= nameToNumberOccurence(nameList,"Ewa");
        System.out.println("Ewa: "+e);
        System.out.println();*/


       /* ArrayList symbols= new ArrayList<String>(Arrays.asList("a", "b", "a", "c", "b"));
        HashMap map= (HashMap) mapFull(symbols);
        int i=0;
        for (String i: map.keySet()) {
            System.out.println("key:" +i+"value:"+map.get(i));
        }*/

        Map <String,Boolean> ex1= new HashMap<>();
        ex1 = (Map<String,Boolean>) mapFull((List) nameList);
        for (String i:ex1.keySet()){
            System.out.println("key: "+i+" value: "+ex1.get(i));

        }

        /*HashMap <String,String> ex= new HashMap<>();
        ex.put("a","Hi");
        ex.put("b","There");
        for (String i:ex.keySet()){
            System.out.println("key: "+i+" value: "+ex.get(i));
        }
        HashMap <String,String> ex1= new HashMap<>();
        ex1 = (HashMap<String, String>) sumMap(ex,"a","b" );
        for (String i:ex1.keySet()){
            System.out.println("key: "+i+" value: "+ex1.get(i));
        }*/




    }

    public  int  nameToNumberOccurence(List <String> list, String name){
        int num=0;
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i)==name){
                num++;}
        } return num;
    }

   public static Map<String,Boolean> mapFull(String[] strings){
        Map <String,Boolean> map=new HashMap<>();

        for ( String s: strings) {

            if (map.containsKey(s)) {
                map.put(s, true);

            } else {
                map.put(s, false);
            }
        }
        return map;
    }

    public static Map sumMap (HashMap map, String a, String b){

       for (Object key:map.keySet()){
            if (map.get(key).equals(a) && map.get(key).equals(b)){
                String a1= (String) map.get(a);
                String b1= (String) map.get(b);
                map.put((a + b), (a1 + b1));

            }

        }return map;
    }
}

