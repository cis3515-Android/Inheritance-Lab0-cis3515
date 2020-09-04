public class Circle extends Shape{
    private double radius;

    public Circle(String name){
        super(name);
        this.radius = 0;
    }

    public void setDimensions(double radius){
        this.radius = radius;
    }

    @Override
    public void printDimensions(){
        double circumference = (2 * Math.PI) * this.radius;
        System.out.println("Shape: [ " + getName() + " ] " + " --Dimensions--\n\tRadius: " + this.radius +
                "\n\tCircumference: " + circumference + "\n\tArea: " + getArea());
    }

    /**
     * @return the area of a Circle as double
     */
    @Override
    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }

}