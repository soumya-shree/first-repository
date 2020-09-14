
public class Calculator {
		public static void main(String[] args) {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			double a1=Double.parseDouble(args[2]);
			int b1=Integer.parseInt(args[3]);
			System.out.println("Output of powerInt method: "+Calculator.powerInt(a,b));
			System.out.println("Output of powerDouble method: "+Calculator.powerDouble(a1,b1));
		}
		static int powerInt(int num1,int num2)
		{ 
			return(int)(Math.pow(num1,num2));
		}
		static double powerDouble(double num1,int num2)
		{
			return(Math.pow(num1,num2));
		}

	}

