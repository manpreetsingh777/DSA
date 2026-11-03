
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int n = word1.length();
        for (int i = 0; i < n; i++) {
            char ch = word1.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            char ch = word2.charAt(i);
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        if (!map1.keySet().equals(map2.keySet()))
            return false;
        ArrayList<Map.Entry<Character, Integer>> list1 = new ArrayList<>(map1.entrySet());
        list1.sort(Map.Entry.comparingByValue());
        ArrayList<Map.Entry<Character, Integer>> list2 = new ArrayList<>(map2.entrySet());
        list2.sort(Map.Entry.comparingByValue());
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).getValue().equals(list2.get(i).getValue())) {
                return false;
            }
        }
        return true;
    }
}
