public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double sideC;
    private static final double PERIMETER = 0.5;

    private enum Shape{


    }
    public Triangle(String name){
        super(name);
        this.sideA = 0;
        this.sideB = 0;
        this.sideC = 0;
    }

    public void setDimensions(double sideA, double sideB, double sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void printDimensions(){
        System.out.println("--Dimensions--\n\tsideA: " + this.sideA
        + "\n\tsideB: " + this.sideB + "\n\tsideC: " + this.sideC + "\n\tArea: "
        + getArea());
    }

    @Override
    public double getArea(){
        return Math.sqrt(PERIMETER * (PERIMETER-sideA) * (PERIMETER-sideB) *
                (PERIMETER-sideC));
    }
}