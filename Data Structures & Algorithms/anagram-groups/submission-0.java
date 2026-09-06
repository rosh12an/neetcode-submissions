class Solution {
    public List<List<String>> groupAnagrams(String[] args){
        Map<String, List<String>> map = new HashMap<>();
        for(String st : args){
            char[] ch = st.toCharArray();
            Arrays.sort(ch);
            String sortedSt = new String(ch);
            map.putIfAbsent(sortedSt, new ArrayList<>());
            map.get(sortedSt).add(st);
        }
        return new ArrayList<>(map.values());
    }
}
