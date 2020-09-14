
public class Array1 {
public static void main(String[]args) {
	int[] x= {2,4,12,6,3};
	int x_len=x.length;
	double sum=0;
	double avg;
	for(int i=0;i<x_len;i=i+1)
	{
		sum=sum+x[i];
	}
	System.out.println("Sum="+sum);
	avg=(sum/x_len);
	System.out.println("Average="+avg);
}
}
