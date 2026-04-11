class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack = new Stack<>();

        for(String s : tokens){

            if("+".equals(s)){
                int one = stack.pop();
                int two = stack.pop();

                stack.push(one + two);
            } else if("-".equals(s)){
                int one = stack.pop();
                int two = stack.pop();

                stack.push(two - one);
            } else if("*".equals(s)){
                int one = stack.pop();
                int two = stack.pop();

                stack.push(two * one);
            } else if("/".equals(s)){
                int one = stack.pop();
                int two = stack.pop();

                stack.push(two / one);
            } else {
                stack.push(Integer.valueOf(s));
            }
        }

        return stack.pop();
    }
}
