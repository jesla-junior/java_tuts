//Write a program by creating an 'Employee' class having the following methods and print the final salary.
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500.
//3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.


import java.util.Scanner;
class Exercise7{
    
    public static void main (String[] args){
        
        Employee employee1 = new Employee();
        
        Scanner input = new Scanner (System.in);
        System.out.println("----------");
        System.out.println("Enter the hourly wage of the employee: ");
        double employeeWage = input.nextDouble();
        System.out.println();
        System.out.println("Enter the number of hours worked by the employee: ");
        double employeeHours = input.nextDouble();
        
        employee1.getInfo(employeeWage, employeeHours);
        employee1.AddSal();
        employee1.AddWork();
        
        System.out.println("The total salary worked by this employee is: " +employee1.getSalary() );
        System.out.println("----------");
        System.out.println();
    }
}


class Employee{
    
    double salary;
    double hours;
    double totalSalary;
    
    
    void getInfo(double salary, double hours){
        
        this.salary = salary;
        this.hours = hours;
        this.totalSalary = this.salary * this.hours;
    }
    
    
    double AddSal(){
        
        if (this.totalSalary < 500){
            
            return this.totalSalary += 10;
        }else{
            
            return this.totalSalary;
        }
        
    }
    
    double AddWork(){
        
        if (this.hours < 6){
            
            return this.totalSalary += 5;
        }else{
            
            return this.totalSalary;
        }
        
    }
    
    double getSalary(){
        
        return this.totalSalary;
    }
}