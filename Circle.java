import java.lang.Math;
public class Circle extends Shape {
    private double mX;
    private double mY;
    private double mRadius;

    public Circle(Double x,Double y, Double radius) {
        mX = x;
        mY = y;
        mRadius = radius;

        if (radius <= 0)
            mRadius = 1;

    }

    public Double getX1()
    {
        return mX;
    }
    public Double getY1()
    {
        return mY;
    }
    public Double getRadius()
    {
        return mRadius;
    }
    public double area()
    {
        System.out.println("Area is: ");
        //exponents
        return (Math.PI*Math.pow(mRadius,2.0));
    }
    public double perimeter()
    {
        System.out.println("Perimeter is: ");
        return (2.0 * Math.PI * mRadius);
    }

    public String toString()
    {
        return "Circle: " + "x: " + getX1() + " y: " + getY1() + " Radius: " + getRadius();
    }
}
