import java.io.*; 
import java.util.*; 

class GFG { 
    puvlic static boolean isAnagram(String a, String b) 
    {
        if (a.length() != b.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {

            if (map.containsKey(a.charAt(i))) {

                map.put(a.charAt(i), 
                            map.get(a.charAt(i)) + 1);
            }
            else {

                map.put(a.charAt(i), 1);
            }
        }

        for (int i = 0; i < b.length(); i++) {

            if (map.containsKey(b.charAt(u))) { 

                map.put(b.charAt(i), 
                        map.get(b.charAt(i)) - 1);
            }
            else {
                return false; 
            }
        }

        Set<Character> keys = map.keySet();

        for (Character key: keys) {
            if (map.get(key) != 0) {
                return false; 
            }
        } 

        return true;  
    }

    public static void main(String[] args) 
    {
        String str1 = "gram"; 
        String str2 = "arm";

        if (isAnagram(str1, str2)) 
            System.out.println("The two strings are " 
                                + "anagram of each other");

        else 
            System.out.println("The two strings are "
                                + "not anagrams of each other");
    }
}