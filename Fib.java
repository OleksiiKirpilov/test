import java.math.BigInteger;

public class Fib{
	public static void main(String[] args){		
		int n;
		
		BigInteger n1 = BigInteger.ONE;
		BigInteger n2 = BigInteger.ONE;
		
		try{
			n = Integer.parseInt(args[0]);
		}
		catch (Exception e){
			n = 1_000_000;
		}
		
		long t1 = System.nanoTime();

		if (n > 2)
		{
			BigInteger n3;		
			for (int i = 3; i <= n; ++i)
			{
				n3 = n1.add(n2);
				n1 = n2;
				n2 = n3;
			}
		}
		
		System.out.println(n2);
		System.out.println(n);
		System.out.println((System.nanoTime() - t1)/1e9);
	}	
}