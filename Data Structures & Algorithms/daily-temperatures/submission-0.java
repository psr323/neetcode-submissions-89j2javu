class Solution {
    class Node {
        int temp;
        int index;

        public Node(int temp, int index){
            this.temp = temp;
            this.index = index;
        }
    }
    public int[] dailyTemperatures(int[] temperatures) {
        
        int sol[] = new int[temperatures.length];

        Stack<Node> stack = new Stack<>();

        for(int i = 0 ; i < temperatures.length ; i++){
            int t = temperatures[i];
            if(stack.isEmpty()){
                stack.push(new Node(t, i));
            } else {
                while(!stack.isEmpty() && stack.peek().temp < t){

                    Node node = stack.pop();
                    sol[node.index] = i - node.index;

                }

                stack.push(new Node(t, i));
            }
        }

        return sol;
    }
}
