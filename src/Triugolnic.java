public class Triugolnic {
    int a;
    int b;
    int c;

    public void area() {
        int per = a + b + c;
        double polper = per / 2d;
        double s = Math.sqrt (polper*(polper - a) * (polper - b) * (polper - c));
        System.out.println(s);
    }


}