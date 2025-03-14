
/* Q ) Create a base class Person with attributes:

name (String)
age (int)
A method displayPerson() to print these details.
Create a derived class Employee that inherits from Person and adds:

emp
salary (double)
A method displayEmployee() to print employee details.
Create another derived class Student that inherits from Person and adds:

grade (String)
A method displayStudent() to print student details.
Create a class Intern, which:

Inherits from both Employee and Student (Hybrid Inheritance simulation using interfaces).
Adds internshipDuration (int, in months).
Implements a method displayIntern() to print all details. */
import java.util.*;

class Person {
    String name = "Uday";
    int age = 19;
    void displayPerson() {
        System.out.println("Person Detials:> " + name + "  and the person age is : " + age);
    }
}
class  Employee extends Person  {
    double salary = 2004.90;
    public void displayEmployee() {
        System.out.println("THE SALARY OF EMP IS:> " + salary);
    }
}
interface Student {
    String grade = "A";
    void displayStudent();
}
class Internship extends Employee implements Student  {
    public void displayStudent() {
        System.out.println("THE GRADE OF THE STUDENT IS:> " + grade);
    }
    void internshipDuration(int months) {
        System.out.println("THE Internship Praposal You get  " + months + " Months");
    }
}
public class HybridInheritance1 extends Internship {
    public static void main(String[] args) {
        HybridInheritance h = new HybridInheritance();
        Internship i = new Internship();
        i.internshipDuration(10);
        i.displayEmployee();
        i.displayPerson();
        i.displayStudent();
    }
}
