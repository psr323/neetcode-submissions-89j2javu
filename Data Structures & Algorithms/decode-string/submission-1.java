class Solution {
        public String decodeString(String s) {
        Stack<String> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            String str1 = "" + c;
            if (str1.equals("]")) {
                String temp = "";
                String val = "";
                while (!temp.equals("[") && !stack.isEmpty()) {
                    temp = stack.pop();
                    if (!temp.equals("["))
                        val = temp + val;
                }

                String val1 = ""; String temp1 = "";
                 while (!stack.isEmpty()) {
                    temp1 = stack.peek();
                    if (isInteger(temp1))
                        {
                            val1 = temp1 + val1;
                            stack.pop();
                        }
                    else break;
                }

                int cnt = Integer.valueOf(val1);
                String str = "";
                while (cnt > 0) {
                    str = val + str;
                    cnt--;
                }

                stack.push(str);
            } else {
                stack.push(str1);
            }
        }
        Collections.reverse(stack);
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }
        return res.toString();
    }

    private static boolean isInteger(String str) {
    if (str == null) {
        return false; // Handle null strings
    }
    try {
        Integer.parseInt(str); // Attempt to parse the string
        return true; // Only reaches here if successful
    } catch (NumberFormatException e) {
        return false; // Catches the exception if parsing fails
    }
}
}