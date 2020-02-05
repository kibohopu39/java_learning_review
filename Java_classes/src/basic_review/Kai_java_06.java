package basic_review;

public class Kai_java_06 {
//99乘法
	public static void main(String[] args) {
		//思考一下，想要呈現三大行，每一行表示該數字從*1~*9，即三大行為一組
		//共三組
		//所以需要經過的迴圈為每一行的兩組數字，即a*b的a與b、每三大行就跳一列，即
		// a*1     (a+1)*1  (a+2)*1
		// ...      ...      ...
		//==========================
		// (a+3)*1 (a+4)*1  (a+5)*1
		// ...      ...      ...
		//.........
		int row = 3;
		int start = 1;
		int col = 3;
		
		for (int k=0; k<row; k++) {//控制行(從0~2
			for (int j=1; j<=9; j++) {//控制b(從1~9
				for (int i=start; i<start+col; i++) {//控制a(從1~3、4~6、7~9
					int newi = i + k * col;//每換單一直行後的a
					int r = newi * j;//商
					System.out.printf("%d x %d = %d\t", newi, j, r);
				}
				System.out.println();//每換一次b就跳下一列
			}
			System.out.println("=====");
		}

	}

}
