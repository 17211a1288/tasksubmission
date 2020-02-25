package epam;

public class layeredarch implements calculator{
	public double addition(double num1,double num2)
	{
		return num1+num2;
	}
	public double subraction(double num1,double num2)
	{
		return num1-num2;
	}
	public double multiplication(double num1,double num2)
	{
		return num1*num2;
	}
	public double division(double num1,double num2)
	{
		if(num2==0)
			return -1;
		return (num1/num2);
	}
}
