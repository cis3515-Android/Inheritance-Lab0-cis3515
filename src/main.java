import java.util.Scanner;

public class main{
    public static void main(String args[]){

    }

    public static void createShape(){
        Shape shape = new Shape("Shape");
        shape.printDimensions();
    }

    public static Square createSquare(){
        
    }

    public static Circle createCircle(){

    }

    public static Triangle createTriangle(){

    }

    private static void promptUser(int numOfInputs, String shapeName){
        System.out.println("Enter " + numOfInputs + "to create a " + shapeName + "\nType '-1' to exit...\n\n");
    }

    private static void promptInput(int counter){
        System.out.println("Enter input #" + counter + ":\t");
    }

    private static double[] getInput(int numOfInputs, String shapeName){
        promptUser(numOfInputs, shapeName);
        double inputArr[] = new double[numOfInputs-1];
        double input = 0;
        int counter = 1;
        Scanner sc = new Scanner(System.in);
        do{
            promptInput(counter);
            while(!sc.hasNextDouble()){
                System.out.println("Please enter a valid double...\n\n");

            }
           inputArr[counter] = sc.nextDouble();
           counter++;
        }while (counter < numOfInputs );

        return inputArr;
    }



}