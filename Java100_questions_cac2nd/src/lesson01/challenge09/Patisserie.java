/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
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
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		int citronpa = (int) ((250 * cake1buy) / price * 100);
		int chocopa = (int) ((280 * cake2buy) / price * 100);
		int pistapa = (int) ((320 * cake3buy) / price * 100);

		System.out.println("内訳");
		System.out.println("シトロン　　\\" + (int) (250 * cake1buy) + "・・・" + citronpa + "%");
		System.out.println("ショコラ　　\\" + (int) (280 * cake2buy) + "・・・" + chocopa + "%");
		System.out
				.println("ピスターシュ　　\\" + (int) (320 * cake3buy) + "・・・" + pistapa + "%");
		//		 * 明日の三色マカロンの配合率が決まりました！
		//		 *
		//		 * シトロンの味    ・・・ 50%
		//		 * ショコラの味    ・・・ 17%
		//		 * ピスターシュの味・・・ 32%
		//		 *
		//		 * が楽しめます！
		//		 *
		//		 * 値段は\270です。
		System.out.println("明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロンの味　　・・・" + citronpa + "%");
		System.out.println("ショコラの味　　・・・" + chocopa + "%");
		System.out.println("ピスターシュ味　・・・" + pistapa + "%");

		System.out.println("\nが楽しめます！\n");
		System.out.println("値段は\\270です。");
	}

}
