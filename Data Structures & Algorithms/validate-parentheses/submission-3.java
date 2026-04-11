class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){

            if(isOpen(c)){
                stack.push(c);
            } else {
                if(!stack.isEmpty()){
                    char prev = stack.pop();
                    boolean flag = isCorrect(prev, c);
                    if(!flag) return false;
                } else {
                    return false;
                }

            }
        }

        return stack.isEmpty();
    }

    private boolean isOpen(char c){
        return c == '[' || c == '(' || c == '{' ;
    }

    private boolean isCorrect(char open, char close){

        if(close == ']') return open == '[';
        if(close == ')') return open == '(';
        if(close == '}') return open == '{';

        return false;

    }
}
