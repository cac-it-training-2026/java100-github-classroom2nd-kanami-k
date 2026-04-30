/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citronStock = 30;
		int chocolatStock = 30;
		int pistacheStock = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・ 残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");
		System.out.print("シトロン　　＞");
		String cake1count = br.readLine();
		double cake1buy = Double.parseDouble(cake1count);

		System.out.print("ショコラ　　＞");
		String cake2count = br.readLine();
		double cake2buy = Double.parseDouble(cake2count);

		System.out.print("ピスターシュ　　＞");
		String cake3count = br.readLine();
		double cake3buy = Double.parseDouble(cake3count);

		System.out.println("ショコラ" + cake2buy + "個");
		System.out.println("シトロン" + cake1buy + "個");
		System.out.println("ピスターシュ" + cake3buy + "個");

		System.out.println("\nシトロン     " + cake1buy + "個");
		System.out.println("ショコラ     " + cake2buy + "個");
		System.out.println("ピスターシュ " + cake3buy + "個");

		System.out.println("合計個数" + (cake1buy + cake2buy + cake3buy) + "個");
		double price = 250 * cake1buy + 280 * cake2buy + 320 * cake3buy;
		System.out.println("合計金額" + price + "円");

		System.out.println("\nをお買いあげですね。");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめの商品です\n");
		citronStock = (int) (citronStock - cake1buy);
		chocolatStock = (int) (chocolatStock - cake2buy);
		pistacheStock = (int) (pistacheStock - cake3buy);

		System.out.println("シトロン　　\\250・・・残り" + citronStock + "個");
		System.out.println("ショコラ      \\280 ・・・ 残り" + chocolatStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・ 残り" + pistacheStock + "個");
	}

}
