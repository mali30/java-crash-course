package company.mohamedali.Inheritance;

import java.util.Objects;

public class Point {

    private int x;
    private int y;

    public Point(int x , int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;

        // check if obj is instance of Point
        if(!(obj instanceof Point)) return false;
        // Downcasting object
        var other = (Point) obj;
        return other.x == x && other.y == y;
    }

    // override hashcode when you override equals()
    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }

}
