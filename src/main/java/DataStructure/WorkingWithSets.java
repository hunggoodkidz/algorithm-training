package DataStructure;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WorkingWithSets {

    public static void main (String[] args){
        TestSets1();

    }

    public static  void TestSets1(){
        Set<Ball> balls = new HashSet<>();
        balls.add( new Ball("blue"));
        balls.add( new Ball("blue"));
        balls.add( new Ball("red"));
        balls.add( new Ball("yellow"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);
        System.out.println(balls);
    }
    static class Ball{
        public Ball(String colors) {
            this.colors = colors;
        }
        String colors;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Ball ball = (Ball) o;
            return Objects.equals(colors, ball.colors);
        }

        @Override
        public int hashCode() {
            return Objects.hash(colors);
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "colors='" + colors + '\'' +
                    '}';
        }
    }
    //record Ball ( String colors){}
}
