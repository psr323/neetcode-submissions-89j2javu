class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set<String> unique = new HashSet<>();

        for(String email : emails){
            String uniqueStr = "";
            String[] parts = email.split("@");
            char[] arr = parts[0].toCharArray();
            for(int i = 0; i < arr.length; i++){
                char c = arr[i];
                if(c == '.') continue;
                if(c == '+') break;
                uniqueStr += c;
            }

            uniqueStr = uniqueStr + "@" + parts[1];

            unique.add(uniqueStr);
        }

        return unique.size();
    }
}