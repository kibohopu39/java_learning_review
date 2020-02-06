package basic_review;

import java.util.Collections;
import java.util.LinkedList;

// 洗牌Var. 2
public class Kai_java_08 {

	public static void main(String[] args) {
		LinkedList<Integer> poker = new LinkedList<>();
		for (int i = 0; i < 52; i++)
			poker.add(i);
		Collections.shuffle(poker);

		for (Integer v : poker) {
			System.out.println(v);
		}

	}

}
