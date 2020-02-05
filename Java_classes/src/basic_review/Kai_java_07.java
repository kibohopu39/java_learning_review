package basic_review;

public class Kai_java_07 {

//隨機不按順序列印出1~52
	public static void main(String[] args) {
		long now = System.currentTimeMillis();// 計算演算的時間用
		// 考慮要隨機不按照順序印出，得先有位置存放這些數字，因此宣告陣列放置數字
		int[] poker = new int[52]; // 初始值 0
//		for (int i=0; i<poker.length; i++) poker[i] = i;//==>也可以這麼寫

		for (int i = 0; i < poker.length; i++) {// 隨機給值
			int rand = (int) (Math.random() * 52); // 0 - 51
			// 由於隨機，會給到重複的值，需要檢查機制
			boolean isRepeat = false;
			for (int j = 0; j < i; j++) {// 給值後，陸陸續續跟前面比較，不重複才繼續
				if (rand == poker[j]) {
					// 重複了
					isRepeat = true;
					break;
				}
			}
			if (!isRepeat) {
				poker[i] = rand;
				System.out.println(poker[i]);
			} else {// 遇到重複就要重複再隨機給值一次
				i--;
			}
		}
		// 總結來說，這支程式很變態，有可能會遇到隨機給值一直給到重複的值
		// 一直持續下去，直到完成為止，後面會再寫一個直接引用java內部排列的方式
		System.out.println("-------------------------");
		System.out.println(System.currentTimeMillis() - now);

	}

}
