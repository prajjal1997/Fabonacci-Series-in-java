import java.util.*; 
public class FabonacciSeries{
	int i,a=-1,b=1,c;
	 public void disp(int n){
		 System.out.println("Fabonacci Series ::");
		 for(i=1;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			 System.out.println(+c);
   
		 }
	 }
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabonacciSeries f=new FabonacciSeries();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter the number::"+num);
        f.disp(num);
        sc.close();
    }

}
