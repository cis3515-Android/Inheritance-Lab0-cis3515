public class Square extends Shape{
    private double length;
    private double height;

    public Square(String name){
        super(name);
        this.length = 0;
        this.height = 0;
    }

    public void setDimensions(double length, double height){
        this.length = length;
        this.height = height;
    }

    @Override
    public void printDimensions(){
        System.out.println("Shape: [ " + getName() + " ] " + " --Dimensions--\n\tLength: " + this.length + "\n\tHeight: " + this.height +
                "\n\tArea: " + getArea());
    }

    /**
        @return the area of a square as double
    */
    @Override
    public double getArea(){
        return length * height;
    }




}