# Java-Assignment-010 - Classes and Objects

## Part 1 - Analyze
* Add Comments to the Code below and label the following:
  1. Class name
  2. All **instance variables/fields** and their data-types
  3. The **Constructor** and the **Constructor Parameters**
  4. Where a **Student** object gets created.
  5. Where the **instance variables** value gets set and what its values are.
  6. All the instance methods for the class **Student**

```java
class Student{ // Class name: Student
    private String name; // Field: String name
    private int rollNo; // Field: int rollNo
   
    Student(String s, int r) // Constructor for Student class
    {
        // Param: String s
        // Param: int r
        name = s; // name gets set to the value of s
        rollNo = r; // rollNo gets set to the value of r
    }
   
    void methodForDisplay() // instance method 
    {
        System.out.println(name+"'s Roll No: "+rollNo);
    }

    public static void main(String[] args) { // NOT an instance method, this is the main method
        Student obj1=new Student("Rambo",21); // Student object created here
        obj1.methodForDisplay();
    }
}
```

## Part 2 - Public VS Static
* Read the W3Schools page on class methods: [W3Schools Java Class Methods](https://www.w3schools.com/java/java_class_methods.asp)
* In your own words, write a few sentences below explaining the difference between static and public methods in relation to a class.
*Static methods belong to a class and can be called from that class (as opposed to an isntance of that class) Static methods do not belong to an instance, and cannot reference instance variables. Public, non-static methods must be called from an instance of that class and can reference instance variables.*

## Part 3 - Dogs
* View the image below, and from the image, construct a Java file **Dog** that mirrors the diagrammed class and the 3 dog objects.
![Dog Class](images/ClassVSObject.png)
* Your class should be named **Dog**
* You should have **private** instance variables/fields for all the data members.
* You should have a **constructor** that sets the initial state of the data members via passed parameters.
    * Think about what data-types the fields and parameters will need!!!
* You should have 4 instance methods for eat, run, sleep, and name
* You should have a **main** method that creates the 3 Dog objects in the diagram.
* Make at least 2 of your methods functional (i.e. perform some action)!!!
    * For Example: method eat might take a class parameter named **Food** (i.e. another class) that has a field **weight**, and your eat method might reduce the weight in **Food**.

## Part 4 - Turn-In
* Commit your code and push it back to your account.
* Create a Pull request as you have been doing for all assignments.
* Paste the Pull request URL back into the Canvass assignment page for credit.