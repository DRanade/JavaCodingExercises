public class AreaCalculator {
    public static double area(double r){
        if (r < 0d) return -1d;
        else return Math.PI*r*r;
    }
    
    public static double area(double x, double y){
        if (x<0 || y<0) return -1d;
        else return x*y;
    }
}
