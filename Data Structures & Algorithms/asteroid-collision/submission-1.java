class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<>();

        for(int i : asteroids){
            while(!stack.isEmpty() && i < 0 && stack.peek() > 0){
                // elements in opp direction
                int diff = i + stack.peek();

                if(diff < 0){ // prev ele is smaller
                    stack.pop();
                } else if(diff > 0){ // curr ele is smaller
                    i = 0;
                } else { // both are eq
                    stack.pop();
                    i = 0;
                }
                
            }
            if(i != 0){
                stack.push(i);
            }
        }

        return stack.stream().mapToInt(Integer::intValue).toArray();
            
    }
}