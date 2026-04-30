/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.println("シトロン　　＞");
		String cake1count = br.readLine();
		int cake1buy = Integer.parseInt(cake1count);
		System.out.println("シトロン" + cake1buy + "個");

		System.out.println("ショコラ　　＞");
		String cake2count = br.readLine();
		int cake2buy = Integer.parseInt(cake2count);
		System.out.println("ショコラ" + cake2buy + "個");

		System.out.println("ピスターシュ　　＞");
		String cake3count = br.readLine();
		int cake3buy = Integer.parseInt(cake3count);
		System.out.println("ピスターシュ" + cake3buy + "個");

		System.out.println("\nシトロン     " + cake1buy + "個");
		System.out.println("ショコラ     " + cake2buy + "個");
		System.out.println("ピスターシュ " + cake3buy + "個");

		System.out.println("合計個数" + (cake1buy + cake2buy + cake3buy) + "個");
		int price = 250 * cake1buy + 280 * cake2buy + 320 * cake3buy;
		System.out.println("合計金額" + price + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");
	}

}
