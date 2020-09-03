public class Square extends Shape{
    private int length;
    private int height;

    public Square(String name){
        super(name);
        this.length = 0;
        this.height = 0;
    }

    public Square(String name, int length, int height){
        super(name);
        this.length = length;
        this.height = height;

    }

    public void setDimensions(int length, int height){
        this.length = length;
        this.height = height;
    }

    @Override
    public void printDimensions(){
        System.out.println("--Dimensions--\n\tLength: " + this.length + "\n\tHeight: " + this.height +
                "\n\tArea: " + getArea());
    }

    /**
        @return the area of a square
    */

    @Override
    public double getArea(){
        return length * height;
    }




}