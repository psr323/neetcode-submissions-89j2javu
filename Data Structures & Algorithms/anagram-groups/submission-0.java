class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            String key = getKey(str);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);

        }

        return new ArrayList<>(map.values());
    }

    private String getKey(String s){
        
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        return new String(arr);

    }
}
