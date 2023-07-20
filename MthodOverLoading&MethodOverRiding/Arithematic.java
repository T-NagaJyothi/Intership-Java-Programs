/*Design a class MathOperations with a method calculate that performs different arithmetic operations (addition, subtraction, multiplication, division) on two integers and returns the result. Implement method overloading to support the following cases:

Perform addition.
Perform subtraction.
Perform multiplication.
Perform division.
*/
class MathOperations
  {
    void arithmetic(int num1,int num2)
    {
      int add=num1+num2;
      System.out.println("addition :"+add);
    }
    void arithmetic(float num1,float num2)
    {
      float sub=num1-num2;
      System.out.println("subtarcation"+sub);
    }
    void arithmetic(float num1,int num2)
    {
      float mul=num1*num2;
      System.out.println("multiplication:"+mul);
    }
    void arithmetic(int num1,float num2)
    {
      float div=num1/num2;
      System.out.println("division:"+div);
    }
  }
class Arithematic
  {
    public static void main(String[] args)
    {
      MathOperations mo=new MathOperations();
      mo.arithmetic(12,13);
      mo.arithmetic(67.9f,34.5f);
      mo.arithmetic(34.6f,34);
      mo.arithmetic(78,34.5f);
    }
  }