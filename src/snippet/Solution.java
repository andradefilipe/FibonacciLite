package snippet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {

	public static void main(String[] args) {
		String input = null;

		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			input = bufferedReader.readLine();
			Long numberLong = Long.parseLong(input);

			System.out.println(fibonacci(numberLong).toString());
		} catch (NumberFormatException ex) {
			System.out.println("Not a number !");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static BigInteger fibonacci(Long n) {
		if (n == 0) {
			return BigInteger.ZERO;
		}
		if (n <= 2) {
			return BigInteger.ONE;
		} else {
			return fibonacci(n - 1).add(fibonacci(n - 2));
		}

	}
}