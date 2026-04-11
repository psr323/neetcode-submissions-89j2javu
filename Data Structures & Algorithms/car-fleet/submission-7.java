class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        Car[] cars = new Car[position.length];

        for(int i = 0; i < position.length ; i++){
            cars[i] = new Car(position[i], speed[i]);
        }

        Arrays.sort(cars, (a,b) -> b.pos - a.pos);

        // cars = reverse(cars);

        Stack<Float> stack = new Stack<>();

        for(Car car : cars){
            Float t = (float)(target - car.pos)/(car.speed);
            System.out.println("Pos = " + car.pos + " Speed = " + car.speed + " Time = " + t);
            if(stack.isEmpty()){
                stack.push(t);
            } else if(t > stack.peek()){
                stack.push(t);
            }
        }

        return stack.size();
    }
}

class Car {
    private int pos;
    private int speed;

    Car(int pos, int speed){
        this.pos = pos;
        this.speed = speed;
    }
}
