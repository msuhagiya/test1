import java.sql.SQLOutput;
public class Calculator { //instance variable
    int a = 30;
    int b = 15;
  //instance method for addition
    public void add() {System.out.println(a + b);}
    //instance method for subtraction
    public void sub() {System.out.println(a - b);}
    //instance method for multiplication
    public void multi() {System.out.println(a * b);}
    //instance method for division
    public void div() {System.out.println(a / b);}
    public static void main(String[] args)
    {//created object to call instance method in static method
        Calculator calculator= new Calculator();
        calculator.add();
        calculator.sub();
        calculator.multi();
        calculator.div();}
}
