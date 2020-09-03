import java.util.Scanner;

public class main{
    public static void main(String args[]){

    }

    public static void createShape(){
        Shape shape = new Shape("Shape");
        shape.printDimensions();
    }

    public static Square createSquare(){
        Square square = new Square("Square");
        String [] dimensions = {"Length", "Height"};
        double [] inputVals = getInput(2,"Square",dimensions);
        square.setDimensions(inputVals[0], inputVals[1]);
    }

    public static Circle createCircle(){

    }

    public static Triangle createTriangle(){

    }

    private static void promptUser(int numOfInputs, String shapeName){
        System.out.println("Enter " + numOfInputs + "to create a " + shapeName + "\nType '-1' to exit...\n\n");
    }

    private static void promptInput(int counter, String[] dimension){
        System.out.println("Enter input for " + dimension[counter] + ":\t");
    }

    private static double[] getInput(int numOfInputs, String shapeName, String[] dimensions){
        promptUser(numOfInputs, shapeName);
        double inputArr[] = new double[numOfInputs-1];
        double input = 0;
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        do{
            promptInput(counter,dimensions);
            while(!sc.hasNextDouble()){
                System.out.println("Please enter a valid double...\n\n");

            }
           inputArr[counter] = sc.nextDouble();
           counter++;
        }while (counter < numOfInputs );

        return inputArr;
    }



}