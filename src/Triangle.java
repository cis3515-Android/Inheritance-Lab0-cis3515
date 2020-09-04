public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;
    private double PERIMETER;

    private enum Shape{


    }
    public Triangle(String name){
        super(name);
        this.sideA = 0;
        this.sideB = 0;
        this.sideC = 0;
        this.PERIMETER = 0.5 * (sideA + sideB + sideC);
    }

    public void setDimensions(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.PERIMETER = 0.5 * (sideA + sideB + sideC);
    }

    @Override
    public void printDimensions(){

        System.out.println("--Dimensions--\n\tsideA: " + this.sideA
        + "\n\tsideB: " + this.sideB + "\n\tsideC: " + this.sideC + "\n\tPerimeter: " + this.PERIMETER +
         "\n\tArea: " + getArea());

        if (PERIMETER == 0){
            System.out.println("AREA is 0, triangle with sides of this length are not possible");
        }
    }

    @Override
    public double getArea(){
        System.out.println(PERIMETER);
        return Math.sqrt(PERIMETER * (PERIMETER-sideA) * (PERIMETER-sideB) *
                (PERIMETER-sideC));
    }
}