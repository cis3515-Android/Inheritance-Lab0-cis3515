public class Shape{
    private String name;

    public Shape(String name){
        this.name = name;
    }

    /**
      @return the name of the shape
     */
    public String getName(){
        return name;
    }

    /**
        @return the area of the shape
     */
    public double getArea(){
        return 0.0;
    }

    public void printDimensions(){
        System.out.println("No dimensions");
    }
}