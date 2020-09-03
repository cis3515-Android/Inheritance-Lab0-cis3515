public class Square extends Shape{
    private int length;
    private int height;

    public Square(String name){
        super(name);
    }

    public void setDimensions(int length, int height){
        this.length = length;
        this.height = height;
    }

    @Override
    public void printDimensions(){
        System.out.println("--Dimensions--\n\tLength: " + this.length + "\n\tHeight: " + this.height);
    }

    @Override
    public double getArea(){
        return length * height;
    }




}