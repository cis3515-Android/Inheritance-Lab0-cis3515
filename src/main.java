import java.util.Scanner;

/**
 * @author Terence Peterson
 * Main class that calls on respective method to create, declare, and display each value in the Shape hierarchy
 */
public class main{
    public static void main(String args[]){
        createShape();
        createSquare();
        createCircle();
        createTriangle();
        createEquilateralTriangle();
    }

    private static void createShape(){
        Shape shape = new Shape("Shape");
        shape.printDimensions();
    }

    private static void createSquare(){
        Square square = new Square("Square");
        String [] dimensions = {"Length", "Height"};
        double [] inputVals = getInput(2,"Square",dimensions);
        square.setDimensions(inputVals[0], inputVals[1]);
        square.printDimensions();

    }

    private static void createCircle(){
        Circle circle = new Circle("Circle");
        String [] dimensions = {"radius"};
        double[] inputVals = getInput(1, "Circle", dimensions);
        circle.setDimensions(inputVals[0]);
        circle.printDimensions();
    }

    public static void createTriangle(){
        Triangle triangle = new Triangle("Triangle");
        String[] dimensions = {"SideA", "SideB", "SideC"};
        double[] inputVals = getInput(3, "Triangle", dimensions);
        triangle.setDimensions(inputVals[0], inputVals[1], inputVals[2]);
        triangle.printDimensions();

    }

    public static void createEquilateralTriangle(){
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle("Equilateral Triangle");
        String[] dimensions = {"AllSides"};
        double[] inputVals = getInput(1,"Equilateral Triangle", dimensions);
        equilateralTriangle.setDimensions(inputVals[0]);
        equilateralTriangle.printDimensions();
    }

    private static void promptUser(int numOfInputs, String shapeName){
        System.out.println("\n\nEnter " + numOfInputs + " dimensions to create a " + shapeName + "\nType '-1' to exit...\n");
    }

    /**
     *
     * @param counter increments the dimension array, to grab the appropriate dimension to prompt user for
     * @param dimension array that holds string list of all dimensions per shape
     */
    private static void promptInput(int counter, String[] dimension){
        System.out.println("Enter a 'double' input for " + dimension[counter] + ":\t");
    }

    /**
     *
     * @param numOfInputs the size limit for the number of inputs to be asked for specific shape
     * @param shapeName the name of the respective shape
     * @param dimensions an array containing string for each desired dimension to ask user for
     * @return an array with double values for each dimension for the respective shape
     */
    private static double[] getInput(int numOfInputs, String shapeName, String[] dimensions){
        promptUser(numOfInputs, shapeName);
        double inputArr[] = new double[numOfInputs];
        double input = 1;
        int counter = 0;
        Scanner sc = new Scanner(System.in);


        do{
             promptInput(counter,dimensions);

             // handles bad input (i.e. not double)
             while(!sc.hasNextDouble()) {
                 sc.next();
                 System.out.println("Please enter a valid double...\n\n");
                 promptInput(counter, dimensions);
             }


            input = sc.nextDouble();

            if (input == -1){
                System.out.println("GoodBye");
                System.exit(1);
                // shapes can't have negative sides, or sides of no length
            } else if (input == 0 || input < -1){
                System.out.println("Please enter a valid double...\n\n");
                continue;
            }

           inputArr[counter] = input;
           counter++;
        }while (counter < numOfInputs);

        return inputArr;
    }



}