class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>(); 
        for (int i : asteroids) { //4
            boolean alive = true; //true
            while (alive && !s.isEmpty() && s.peek() > 0 && i < 0) { //true, no, 2>0, 4<0
                if (s.peek() < Math.abs(i)) //2<1
                    s.pop(); //
                else if (s.peek() == Math.abs(i)) { ///2 == 1
                    s.pop();
                    alive = false;
                } else
                    alive = false; //false
            }
            if (alive)
                s.push(i); //-6,2,4
        }

        int[] res = new int[s.size()];
        for (int i = s.size() - 1; i >= 0; i--) {
            res[i] = s.pop();
        }
        return res;
    }
}