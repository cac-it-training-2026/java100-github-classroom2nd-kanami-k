package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO 自動生成されたメソッド・スタブ

class Robot {

	String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum, int chocoNum) {
		int flour = flourNum - 170;
		int sugar = sugarNum - 50;
		int egg = eggNum - 2;
		int butter = butterNum - 80;
		int choco = chocoNum - 1;

		String menu = null;
		if ((flour >= 0) && (sugar >= 0) && (egg >= -1) && (butter >= 0)) {
			menu = "クッキー";

		} else if ((egg >= 0) && (butter >= -75))

		{
			menu = "オムレツ";

		} else if (egg >= -1) {
			menu = "ゆで卵";
		} else if ((flour >= 0) && (sugar >= 0) && (egg >= -1) && (butter >= 0) && (choco >= 0)) {
			menu = "チョコクッキー";
		}

		else {
			menu = null;
		}
		return menu;

	}
}

public class SuperRobot {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("小麦粉の量を入力してください（グラム）＞");
		String flourNumStr = br.readLine();
		int flourNum = Integer.parseInt(flourNumStr);

		System.out.print("\n砂糖の量を入力してください（グラム）＞");
		String sugarNumStr = br.readLine();
		int sugarNum = Integer.parseInt(sugarNumStr);

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\nバターの量を入力してください（グラム）＞");
		String butterNumStr = br.readLine();
		int butterNum = Integer.parseInt(butterNumStr);

		System.out.print("\nチョコレートの量を入力してください（グラム）＞");
		String chocoNumStr = br.readLine();
		int chocoNum = Integer.parseInt(chocoNumStr);

		Robot robot = new Robot();
		String menu = robot
				.makeEggDishes(flourNum, sugarNum, eggNum, butterNum, chocoNum);
		System.out.println("\n" + menu + "が出来ました。");

	}

}
