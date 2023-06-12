class Calc 
{
int num1,num2,result;

public void add()
{
     result = num1+num2;
}
public void subtract()
{
    result = num1-num2;
}
}
class perform 
{
    public static void main(String[]args) 
    {
     Calc obj= new Calc();
     obj.num1=5;
     obj.num2=7;
     obj.add();
     System.out.println(obj.result);
     obj.subtract();
     System.out.println(obj.result);
    }
}