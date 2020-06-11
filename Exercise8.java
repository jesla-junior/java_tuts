//A class called Author is designed as shown in the class diagram. It contains:

//   Three private member variables: name (String), email (String), and gender (char of either 'm' or 'f' - you might also use a boolean variable called isMale having value of true or false).
//  A constructor to initialize the name, email and gender with the given values.
//   (There is no default constructor, as there is no default value for name, email and gender.)
//   Public getters/setters: getName(), getEmail(), setEmail(), and getGender().
//   (There are no setters for name and gender, as these properties are not designed to be changed.)
//    A toString() method that returns "name (gender) at email", e.g., "Tan Ah Teck (m) at ahTeck@somewhere.com".




public class Exercise8 {
    
    public static void main (String[] args){
        
        
        Author junior = new Author ("Junior", "junior@gmail.com", 'm');
        //testing
        System.out.println(junior);
        junior.setEmail("junior@yahoo.com");
        System.out.println(junior);
        System.out.println("name is " +junior.getName() );
        System.out.println("gender is " +junior.getGender() );
        System.out.println("email is " +junior.getEmail() );
        
        
        Book b1 = new Book ("Introduction to Life", junior, 9.99, 12);
        System.out.println(b1);
        
        
        //Creating a new book created by an entirely new author
        
        Book b3 = new Book ("Boxing for Dummies", new Author("Bash", "bash@yahoo.com", 'm'), 59.99, 2);
        System.out.println(b3);

    }
}//end of class Exercise8


class Author{
    
    
    private String name;
    private String email;
    private char gender;
    
    //Constructor
    public Author(String name, String email, char gender){
        
        this.name = name;
        this.email = email;
        this.gender = gender;
        
    }//end of constructor
    
  
    //public getter and setter methods 
    
    public String getName(){
        
        return name;
        
    }
    
    public String getEmail(){
        
        return email;
        
    }
    
    public char getGender(){
        
        return gender;
        
    }

    public void setEmail(String email){
        
        this.email = email;
        
    }

    public String toString(){
        
        return name+ " (" +gender+ ") at " +email ;
        
    }
        
}//end of class Author



 class Book{
     
     private String name;
     private Author author;
     private double price;
     private int qty;
     
     
     //Constructor
     public Book (String name, Author author, double price, int qty){
         
         this.name = name;
         this.author = author;
         this.price = price;
         this.qty = qty;
     }
     
     
     public String getName(){
         
         return name;
     }
     
     public Author getAuthor(){
         
         return author;
     }
     
     public double getPrice(){
         
         return price;
     }
     
     public void setPrice(double price){
         
         this.price = price;
     }
     
     public int getQty(){
         
         return qty;
     }
 
    public void setQty(int qty){
        
        this.qty = qty;
    }
 
     
    public String toString(){
        
        return "'" +name+ "' by " +author;
    }
 
 }//end of class Book









