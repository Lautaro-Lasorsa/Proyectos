package ejemploA;
import java.util.*;
public class Fibonacci {
	public static ArrayList<Integer> CrearFibonacci(int a, int b, int l)
	{
		ArrayList<Integer> ret = new ArrayList<Integer>();
		ret.add(a);
		ret.add(b);
		for(int i = 2;i<l;i++)
		{
			ret.add(ret.get(i-1) + ret.get(i-2));
		}
		return ret;
	}
}
