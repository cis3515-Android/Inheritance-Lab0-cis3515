public class EquilateralTriangle extends Triangle{


    private double allSides;

    public EquilateralTriangle(String name){
        super(name);
        this.allSides = 0;
    }

    public void setDimensions(double allSides){
        this.allSides = allSides;
    }

    @Override
    public void printDimensions(){
        System.out.println("Shape: [ " + getName() + " ] " + " --Dimensions--\n\tSides Length: " + allSides +
                "\n\tArea: " + getArea());
    }

    /**
     @return the area of a equilateral triangle as double
     */
    @Override
    public double getArea(){
        return (Math.sqrt(3) / 4) * (this.allSides * this.allSides);
    }
}