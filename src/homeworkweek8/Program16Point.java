package homeworkweek8;

public class Program16Point {

    //instance variable
    int x;
    int y;

    //Constructor with zero args
    Program16Point() {
    }

    //parameterised constructor
    Program16Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int a) {
        this.x = a;
    }

    public void setY(int b) {
        this.y = b;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - getX()) * (x - getX()) + (y - getY()) * (y - getY()));
    }

    public double distance(Program16Point secondPoint) {
        return distance(secondPoint.x, secondPoint.y);
    }

    public static void main(String[] args) {
        Program16Point first = new Program16Point(6, 5);
        Program16Point second = new Program16Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Program16Point point = new Program16Point();
        System.out.println("distance()= " + point.distance());
    }
}
