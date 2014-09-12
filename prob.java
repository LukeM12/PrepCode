import java.util.*;

public class prob {
    
    public static void main(String[] args){
    check_unique_characters("hello world");
    }

    public static boolean check_unique_characters(String str){
        HashMap<Character, Integer> a = new HashMap<Character,Integer>();
        for (int i = 0, n = str.length(); i < n; i++) {
            char c = str.charAt(i);
            Integer check = a.get(c);
            System.out.println(check);
            if (null == check){
                    System.out.println("This got here "  + c);
                    a.put(c, 1);
            }
            else {
                    System.out.println(c + " Is a duplicate character in hello world");
        }
        }
        System.out.println("The Hashmap looks like this");
        for (Character key : a.keySet()) {
                System.out.println(key);
        }

    
        return true;
    }
}
