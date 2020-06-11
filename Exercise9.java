//Trying to demonstrate Composition
//We will have 2 classes; Point and Line classes
//The point class will create a point object consisting of 2 coordinates: x and y. It will also have methods carrying out operations on this point or the individual x and/or y coordinates
//The line class will create a line object consisting of 2 points: say A and B. It will also contain methods carrying out operations on these points or the individual points, sometimes by invoking some methods from the point class. 

import java.util.Arrays;

public class Exercise9{
    
    public static void main (String[] args){
        
        // Test constructor and toString()
      Line l1 = new Line(1, 2, 3, 4);
      System.out.println(l1);  // Line's toString()
      //Line[start=(1,2),end=(3,4)]
      Line l2 = new Line(new Point(5,6), new Point(7,8));  // anonymous Point's instances
      System.out.println(l2);  // Line's toString()
      //Line[start=(5,6),end=(7,8)]

      // Test Setters and Getters
      l1.setStart(new Point(11, 12));
      l1.setEnd(new Point(13, 14));
      System.out.println(l1);  // Line's toString()
      //Line[start=(11,12),end=(13,14)]
      System.out.println("start is: " + l1.getStart());  // Point's toString()
      //start is: (11,12)
      System.out.println("end is: " + l1.getEnd());  // Point's toString()
      //end is: (13,14)

      l1.setStartX(21);
      l1.setStartY(22);
      l1.setEndX(23);
      l1.setEndY(24);
      System.out.println(l1);  // Line's toString()
      //Line[start=(21,22),end=(23,24)]
      System.out.println("start's x is: " + l1.getStartX());
      //start's x is: 21
      System.out.println("start's y is: " + l1.getStartY());
      //start's y is: 22
      System.out.println("end's x is: " + l1.getEndX());
      //end's x is: 23
      System.out.println("end's y is: " + l1.getEndY());
      //end's y is: 24

      l1.setStartXY(31, 32);
      l1.setEndXY(33, 34);
      System.out.println(l1);  // Line's toString()
      //Line[start=(31,32),end=(33,34)]
      System.out.println("start's x and y are: " + Arrays.toString(l1.getStartXY()));
      //start's x and y are: [31, 32]
      System.out.println("end's x and y are: " + Arrays.toString(l1.getEndXY()));
      //end's x and y are: [33, 34]

      // Test getLength()
      System.out.printf("length is: %.2f%n", l1.getLength());
      //length is: 2.83
        
        

        
        
    }
    
}





class Point{
    
    private int x, y;
    
    //Constructors
    public Point(){
        
        this.x = 0;
        this.y = 0;
            
    }
    
    public Point(int x, int y){
        
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        
        return x;
    }
    
    public void setX(int x){
        
        this.x = x;
    }
    
    public int getY(){
        
        return y;
    }
    
    public void setY(int y){
        
        this.y = y;
    }
    
    public String toString(){
        
        return "(" +x+ ", " +y+ ")";
    }
    
    public int[] getXY(){
        
        int[] resultArray = new int[2];
        resultArray[0] = x;
        resultArray[1] = y;
        return resultArray;
    }
        
    public void setXY(int x, int y){
        
        this.x = x;
        this.y = y;
    }
    
    //distance from this point to point coordinates given: x and y
    public double distance(int x, int y){
        
        int differenceX = this.x - x;
        int differenceY = this.y - y;
        return Math.sqrt(differenceX*differenceX + differenceY*differenceY);
    }
    
    //distance from this point to given point A
    public double distance(Point A){
        
        int differenceX = this.x - A.x;
        int differenceY = this.y - A.y;
        return Math.sqrt(differenceX*differenceX + differenceY*differenceY);
    }

    //distance from this point to origin (0,0)
    public double distance(){
        
        return Math.sqrt(x*x + y*y);
    }
    
}//End of class Point







class Line{
    
    private Point start;
    private Point end;
    
    //Constructors
    public Line(int x1, int y1, int x2, int y2){
        
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);        
    }
    
    public Line(Point start, Point end){
        
        this.start = start;
        this.end = end;
    }
    
    public Point getStart(){
        
        return start;
    }
    
    public void setStart(Point start){
        
        this.start = start;
    }
    
    public Point getEnd(){
        
        return end;
    }
    
    public void setEnd(Point end){
        
        this.end = end;
    }
    
    public int getStartX(){
        
        return start.getX();
    }
    
    public void setStartX(int x){
        
        this.start.setX(x);
    }
    
    public int getStartY(){
        
        return this.start.getY();
    }
    
    public void setStartY(int y){
        
        this.start.setY(y);
    }

    public void setStartXY(int x, int y){
        
        this.start.setXY(x, y);
    }
    
    public int[] getStartXY(){
        
        return this.start.getXY();
    }
    
    public void setEndX(int x){
        
        this.end.setX(x);
    }
    
    public int getEndX(){
        
        return this.end.getX();
    }
    
    public void setEndY(int y){
        
        this.end.setY(y);
    }
    
    public int getEndY(){
        
        return this.end.getY();
    }

    public void setEndXY(int x, int y){
        
        this.end.setXY(x, y);
    }
    
    public int[] getEndXY(){
        
        return this.end.getXY();
    }
    
    public String toString(){
        
        return "Line[start=" +start+ ", end=" +end+ "]";
    }
    
    //distance between the two points start and end
    public double getLength(){
        
        return start.distance(end);
    }
    
    
    
    
}//End of class Line