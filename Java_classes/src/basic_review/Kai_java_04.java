package basic_review;

public class Kai_java_04 {

	public static void main(String[] args) {
		// 宣告一個陣列a
		int[] a = null;
		//印出
		System.out.println(a);
		//顯示尚未初始化，點擊後，預設初始化是null
		//new 一個整數且長度為3的陣列給a
		a = new int[3];
		//所謂的 new，指的是將a，依照int[3]這樣的設定去初始化
		//在這裡沒有設定值的話，初始化後值為0
		
		//驗證一下，上述可以寫成一列如下，且印出0
		int[] b = new int[4];
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("---");
		//宣告並設定其內容，可以用下面兩個寫法
		int[] c = new int[] { 1, 2, 3, 4 };
		int[] d = { 1, 2, 3, 4 };
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

	}

}
