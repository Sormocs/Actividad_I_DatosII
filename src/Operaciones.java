import java.lang.Math;

public class Operaciones {

    public static Operaciones instance = null;

    public static Operaciones getInstance(){
        if (instance == null){
            instance = new Operaciones();
        }
        return instance;
    }

    public double Mult(double a,double b){
        double r = a*b;
        return r;
    }

    public double Suma(double a, double b){
        double r = a+b;
        return r;
    }

    public double Resta(double a,double b){
        double r = a-b;
        return r;
    }

    public double Div(double a, double b){
        double r = a/b;
        return r;
    }

    public double SQRT(double a){
        double r = Math.sqrt(a);
        return r;
    }
}