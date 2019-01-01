public class Point {
    int co;

    public int setX(int a,int v, double t){
        double rad = Math.toRadians(a);
        Point point = new Point();
        point.co=(int)(v*Math.cos(rad)*t);
        return point.co;
    }

    public int setY(int a,int v, double t){
        double rad = Math.toRadians(a);
        Point point = new Point();
        point.co=(int)(-(v*Math.sin(rad)*t - (10*t*t)/2));
        return point.co;
    }

    public double findT(int a,int v){
        double rad = Math.toRadians(a);
        double tMax = (2*v*Math.sin(rad))/10;
        return tMax;
    }

}
