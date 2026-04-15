/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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
		double price = (250 * cake1buy) + (280 * cake2buy) + (320 * cake3buy);
		int price1 = (int) price;

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

		System.out.println("\n閉店のお時間となりました。\n");
		System.out.println("またのお越しをお待ちしております。");
		System.out.println("\n売り上げの割合\n");
		System.out.println("売り上げの合計　\\" + price1);

		System.out.println("内訳");
		System.out.println("シトロン　　\\" + (int) (250 * cake1buy) + "・・・" + (int) ((250 * cake1buy) / price * 100) + "%");
		System.out.println("ショコラ　　\\" + (int) (280 * cake2buy) + "・・・" + (int) ((280 * cake2buy) / price * 100) + "%");
		System.out
				.println("ピスターシュ　　\\" + (int) (320 * cake3buy) + "・・・" + (int) ((320 * cake3buy) / price * 100) + "%");

	}

}
