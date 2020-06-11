//TASK 1
//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

//TASK 2
//Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.

class Exercise5 {
    
    public static void main (String[] args){
        
        Student student1 = new Student();
        student1.setName("John");
        student1.setRoll(2);
        student1.setAddress("67 Whitley Wood Lane");
        student1.setPhone(12345);
        
        Student student2 = new Student();
        student2.setName("Sam");
        student2.setRoll(3);
        student2.setAddress("73 Filey Road");
        student2.setPhone(67890);
        
        System.out.println();
        System.out.println("----------------");
        System.out.println("student name is " +student1.getName()+ ", Roll number is " +student1.getRoll()+ ", phone number is " +student1.getPhone()+ " and address is " +student1.getAddress()+ "." );
        
        System.out.println();
        System.out.println("student name is " +student2.getName()+ ", Roll number is " +student2.getRoll()+ ", phone number is " +student2.getPhone()+ " and address is " +student2.getAddress()+ "." );
        System.out.println("----------------");
        System.out.println();
    }
}


class Student {
    
    private String name;
    private int roll_no;
    private String address;
    private int phone;
    
    //setter method for name
    void setName(String name){
        this.name = name;
    }
    
    //accessor method for name
    String getName(){
        return this.name;
    }
    
    //setter method for roll
    void setRoll(int roll_no){
        this.roll_no = roll_no;
    }
    
    //accessor method for roll
    int getRoll(){
        return this.roll_no;
    }
    
    //setter method for name
    void setAddress(String address){
        this.address = address;
    }
    
    //accessor method for name
    String getAddress(){
        return this.address;
    }
    
    //setter method for name
    void setPhone(int phone){
        this.phone = phone;
    }
    
    //accessor method for name
    int getPhone(){
        return this.phone;
    }
}