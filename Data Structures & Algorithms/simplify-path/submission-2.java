class Solution {
    public String simplifyPath(String path) {
        
        Stack<String> stack = new Stack<>();
        for(String s : path.split("/")){

            // if(stack.isEmpty()){
            //     stack.push(s);
            //     continue;
            // }
            if(s.isBlank() || s.equals(".")){
                continue;
            }
            else if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else {
                stack.push(s);
            }

        }

        String[] res = new String[stack.size()];
        while(!stack.isEmpty()){
            res[stack.size() - 1] = stack.pop();
        }

        return "/" + String.join("/", res);
    }
}