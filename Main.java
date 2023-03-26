import javax.swing.*;
import java.util.Scanner;

public class Main
{
    private static Scanner Reader = new Scanner(System.in);


    public static void main(String[] args)
    {
        System.out.print("How many shapes do you want? ");
        int count = Integer.valueOf(Reader.nextLine());

        Shape[] shapes = new Shape[count];


        fillShapes(shapes,count);
        printShapes(shapes);
        printMenu();


        // call procedure fillShapes() passing the array of shapes
        // call procedure printShapes() passing the array of shapes
        // call function printMenu()

        while (true)
        {
            System.out.print("Please select an option from the menu: ");
            int menuChoice = Reader.nextInt();
            switch(menuChoice){
                case 1:
                    System.out.print("Please input the index of the shape you want: ");
                    int shapeidx = Reader.nextInt();
                    System.out.println(shapes[shapeidx].area());
                    break;
                case 2:
                    System.out.print("Please input the index of the shape you want: ");
                    int shapeidx2 = Reader.nextInt();
                    System.out.println(shapes[shapeidx2].perimeter());
                    break;
                case 3:
                   return;
            }

            }


            // ask the user for their menu selection
            // read user menu selection input
            // if menu selection is 3, then break out of this while loop

            // ask the user which shape index they are interested in
            // read user input for shape selection

            // switch on user menu selection
            //   case 1
            //      call the selected shape's area() function
            //      print out the area
            //   case 2
            //      call the selected shape's perimeter function
            //      print out the perimeter
        }


    private static void fillShapes(Shape[] stuff, int count)
    {
        for (int i = 0; i < count; i++) {
            System.out.print("Is Shape " + (i) + " a Circle? y or n? ");
            //use scanner
            while(!Reader.hasNext());
            String answer = Reader.nextLine();
            if (answer.equals("y")) {
                System.out.print("Please enter an x-coordinate: ");
                Double x = Double.valueOf(Reader.nextLine());
                System.out.print("Please enter a y-coordinate: ");
                Double y = Double.valueOf(Reader.nextLine());
                System.out.print("Please enter a radius: ");
                Double radius = Double.valueOf(Reader.nextLine());
                Circle c1 = new Circle(x, y, radius);
                stuff[i] = c1;
            } else {
                System.out.print("Please enter an x-coordinate: ");
                Double x1 = Double.valueOf(Reader.nextLine());
                System.out.print("Please enter a y-coordinate: ");
                Double y1 = Double.valueOf(Reader.nextLine());
                System.out.print("Please enter a height: ");
                Double height = Double.valueOf(Reader.nextLine());
                System.out.print("Please enter a width: ");
                Double width = Double.valueOf(Reader.nextLine());
                Rectangle r1 = new Rectangle(x1, y1, width, height);
                stuff[i] = r1;
            }
        }

        // iterate through the array of shapes passed in with a definite loop
        //
        //    ask the user if this shape should be a circle
        //    read their response
        //
        //    if they want a circle
        //       ask and read in x, y, and radius values
        //       create an instance of a Circle obj and store it in the shape array passed in
        //    else
        //       ask and read in x, y, width and height values
        //       create an instance of a Rectangle obj and store it in the shape array passed in
    }

    private static void printShapes(Shape[] stuff)
    {
        System.out.println("\n--------------------");
        for (int i = 0; i < stuff.length; i++)
            System.out.println((i) + "|"+ stuff[i]);

        // iterate through the array of shapes passed in with a definite loop
        //    print each index and shape all on one line
    }

    private static void printMenu()
    {
        System.out.println("--------------------");
        System.out.println("1) Area");
        System.out.println("2) Perimeter");
        System.out.println("3) EXIT");
        System.out.println("--------------------");
    }
}