package basic_review;

public class Kai_java_02 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		// 在 &&之後的--b並沒有運算，前面的a+1後若不合就直接進入else了
		// 意味著，往後要注意這個特性
		if (++a <= 10 && --b >= 3) {
			System.out.printf("OK: a = %d, b = %d\n", a, b);
		} else {
			System.out.printf("XX: a = %d, b = %d\n", a, b);// 得到 XX: a = 11, b = 3
		}

		int x = 2, y = 3;
		// 位元運算:運算時，你要用二進位去理解，即換成二進位再運算
		// 包含 & (AND)、| (OR)、^ (XOR)、~ (NOT)
		// AND:每一個對應至同一位元位置的兩個運算元兩者為 1 時，返回 1。
		System.out.println("AND運算：");
		System.out.printf("2 AND 2 %5d%n", x & x);
		System.out.printf("2 AND 3 %5d%n", x & y);
		System.out.printf("3 AND 2 %5d%n", y & x);
		System.out.printf("3 AND 3 %5d%n", y & y);
		//OR:每一個對應至同一位元位置的兩個運算元兩者或其中一者為 1 時，返回 1。
		System.out.println("\nOR運算：");
		System.out.printf("2 OR 2 %6d%n", x | x);
		System.out.printf("2 OR 3 %6d%n", x | y);
		System.out.printf("3 OR 2 %6d%n", y | x);
		System.out.printf("3 OR 3 %6d%n", y | y);
		//XOR:每一個對應至同一位元位置的兩個運算元其中一者而非兩者為 1 時，返回 1。
		System.out.println("\nXOR運算：");
		System.out.printf("2 XOR 2 %5d%n", x ^ x);
		System.out.printf("2 XOR 3 %5d%n", x ^ y);
		System.out.printf("3 XOR 2 %5d%n", y ^ x);
		System.out.printf("3 XOR 3 %5d%n", y ^ y);

	}

}
