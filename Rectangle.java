public class Rectangle extends Shape {
    // 4 private member variables
    private double mXValue;
    private double mYValue;
    private double mWidth;
    private double mHeight;

    //constructor
    public Rectangle(Double xValue, Double yValue, Double width, Double height)
    {
        mXValue = xValue;
        mYValue = yValue;
        mWidth = width;
        mHeight = height;

        if (width <= 0 || height <= 0)
        { mWidth = 1;
            mHeight = 1;
        }
    }
    //accessor methods
    public Double getX()
    {
        return mXValue;
    }
    public Double getY()
    {
        return mYValue;
    }
    public Double getWidth()
    {
        return mWidth;
    }
    public Double getHeight()
    {
        return mHeight;
    }
    //overriding area() and perimeter()
    public double area()
    {
        System.out.println("Area is: ");
        return (mHeight * mWidth);
    }

    public double perimeter()
    {
        System.out.println("Perimeter is: ");
        return (2.0 * mHeight) + (2.0 * mWidth);
    }

    //overriding toString
    public String toString()
    {
        return "Rectangle: " + "x: " + getX() + " y: " + getY() + " Width: " + getWidth() + " Height: " + getHeight();
    }
}
