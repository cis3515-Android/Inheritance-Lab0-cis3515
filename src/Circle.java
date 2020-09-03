public class Circle extends Shape{
    private int radius;

    public Circle(String name){
        super(name);
        this.radius = 0;
    }

    public Circle(String name, int radius){
        super(name);
        this.radius = radius;
    }

    public void setDimensions(int radius){
        this.radius = radius;
    }

    @Override
    public void printDimensions(){
        double circumference = (2 * Math.PI) * this.radius;
        System.out.println("--Dimensions--\n\tRadius: " + this.radius +
                "\n\tCircumference: " + circumference + "\n\tArea: " + getArea());
    }

    /**
     * @return the area of a Circle
     */
    @Override
    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }

}