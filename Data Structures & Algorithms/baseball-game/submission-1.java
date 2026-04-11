class Solution {
    public int calPoints(String[] operations) {
        // 5 -2 -4 9 5 14
        Stack<String> stack = new Stack<>();
        int res = 0;
        for(String op : operations){
            if("+".equals(op)){
                String one = stack.pop();
                String two = stack.pop();

                String sum = (Integer.valueOf(one) + Integer.valueOf(two)) + "";

                stack.push(two);
                stack.push(one);
                stack.push(sum);

            } else if("C".equals(op)){
                stack.pop();
            } else if("D".equals(op)){
                String one = stack.pop();
                String prod = (Integer.valueOf(one) * 2) + "";
                stack.push(one);
                stack.push(prod);
            } else {
                stack.push(op);
            }

            System.out.println(stack);
        }

        while(!stack.isEmpty()){
            int val = Integer.valueOf(stack.pop());
            res += val;
        }

        return res;
    }
}