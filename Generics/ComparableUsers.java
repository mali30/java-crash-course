package company.mohamedali.Generics;

public class ComparableUsers implements Comparable<ComparableUsers> {

    private int points;

    public ComparableUsers(int points){
        this.points = points;
    }

    @Override
    public int compareTo(ComparableUsers other) {
        // comparing objects
        return points - other.points;

    }

    @Override
    public String toString() {
        return "Points ====" + points;
    }
}
