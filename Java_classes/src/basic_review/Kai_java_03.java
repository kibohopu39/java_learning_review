package basic_review;

public class Kai_java_03 {

	public static void main(String[] args) {
		//break 和 continue 的差別，一個直接停止，一個跳過這一次
		for (int i=0; i<20; i++) {
			if (i==17) {
				break;
				//continue;
			}
			System.out.println(i);
		}
		System.out.println("Over");

	}

}
