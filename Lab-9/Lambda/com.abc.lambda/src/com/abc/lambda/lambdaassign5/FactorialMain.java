package com.abc.lambda.lambdaassign5;

import com.abc.lambda.lambdaassign.Factorial;

public class FactorialMain 
{
	static Factorial fn;

public static void main(String[] args) {
	
	fn = (n) -> {
		if (n == 0)
			return 1;
		else {
			return n * (fn.fact(n - 1));
		}
	};
	int i = fn.fact(7);
	System.out.println(i);
}


}
