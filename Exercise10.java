  //The code below demonstrates inheritance with regards to java programming
//Containing two major classes, circle and cylinder, the latter(subclass) inherits from the former(superclass). 
//Also demonstrates polymorphism with the getArea methods in both classes



public class Exercise10{
    
    public static void main (String[] args){
        
        Cylinder cy1 = new Cylinder();
        //Construced a Circle with Circle()
        //Constructed a Cylinder with Cylinder()
        System.out.println("Radius is " + cy1.getRadius()
        + ", Height is " + cy1.getHeight()
        + ", Color is " + cy1.getColor()
        + ", Base area is " + cy1.getArea()
        + ", Volume is " + cy1.getVolume());
        //Radius is 1.0, Height is 1.0, Color is red,
        //Base area is 3.141592653589793, Volume is 3.141592653589793

        Cylinder cy2 = new Cylinder(5.0, 2.0);
        //Construced a Circle with Circle(radius)
        //Constructed a Cylinder with Cylinder(height, radius)
        System.out.println("Radius is " + cy2.getRadius()
        + ", Height is " + cy2.getHeight()
        + ", Color is " + cy2.getColor()
        + ", Base area is " + cy2.getArea()
        + ", Volume is " + cy2.getVolume());
        //Radius is 2.0, Height is 5.0, Color is red,
        //Base area is 12.566370614359172, Volume is 62.83185307179586
        
        System.out.println(cy1);
    }
    
}


class Circle{
    
    private double radius;
    private String color;
    
    //Constructors
    public Circle(){
        
        this.radius = 1.0;
        this.color = "red";
        
    }
    
    public Circle (double radius){
        
        this.radius = radius;
        this.color = "red";
    }
    
    public Circle (double radius, String color){
        
        this.radius = radius;
        this.color = color;
    }
    
    public double getRadius(){
        
        return radius;
    }
    
    public void setRadius(double radius){
        
        this.radius = radius;
    }
    
    public String getColor(){
        
        return color;
    }
    
    public void setColor(String color){
        
        this.color = color;
    }
    
    public String toString(){
        
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
    
    public double getArea(){
        
        return radius * radius * Math.PI;
    }
    
    
    
}//endo of circle class




class Cylinder extends Circle{
    
    private double height;
    
    //Constructors
    public Cylinder(){
        
        super();    //this line will invoke the superclass' constructor Circle()
        this.height = 1.0;
    }
    
    public Cylinder (double height){
        
        super();    //this line will invoke the superclass' constructor Circle()
        this.height = height;
    }
        
    public Cylinder (double height, double radius){
        
        super(radius);  //invoke constructor Circle (double radius)
        this.height = height;
    }
    
    public Cylinder (double height, double radius, String color){
        
        super(radius, color);//constructor Circle (double radius, String color)
        this.height = height;
    }
    
    public double getHeight(){
        
        return height;
    }
        
    public void setHeight(double height){
        
        this.height = height;
    }
    
    //This method overrides the toString in the superclass Circle
    //Demonstrates Polymorphism
    @Override
    public String toString (){
        
        return "Here is a Cylinder inheriting from the Circle class";
    }
    
    //this method calculates the outer surface area of the cylinder
    //Demonstrates Polymorphism
    @Override
    public double getArea(){
        
        return 2 * Math.PI * getRadius();
    }
    
    public double getVolume(){
        
        return getArea() * height;  //utilizing class Circle's getArea() method
    }
    
}//end of Cylinder class