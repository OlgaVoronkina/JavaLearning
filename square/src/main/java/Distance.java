public class Distance {
    public static void main(String[] args) {
        Point p = new Point(2.0,5.0, 8.0, 9.);
        System.out.println("Длина прямой = "+distance(p));
    }

    public static double distance(Point p){

        double d=Math.sqrt(((p.x1-p.x2)*(p.x1-p.x2))+((p.y1-p.y2)*(p.y1-p.y2)));
        return d;
    }
}
