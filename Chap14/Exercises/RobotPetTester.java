package Chap14.Exercises;

//Scannerをインポート
import java.util.Scanner;

//petパッケージのRobotPetクラスをインポート
import pet.RobotPet;

/*
* クラス名:RobotPetTester
* 概要：ロボットペットクラスをテストする
* 作成者:S.Hiruta
* 作成日:2024/05/29
*/
public class RobotPetTester {

	//Scannerクラスの変数を設定
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：inputIntegralNumber
	 * 概要:テキスト(String型)を入力させる
	 * 引数：入力内容の文言(String型)
	 * 戻り値：入力された文言(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	static String inputString(String desplayIssue) {

		//入力内容の文言を表示
		System.out.print(desplayIssue);

		//入力された文言を読み込む
		String stringText = standardInput.next();

		//入力された文言を返却
		return stringText;
	}

	/*
	 * 関数名：inputLimitatValue
	 * 概要:入力された指定範囲内の数値を返却する
	 * 引数：入力内容に関する文言(String型),範囲の最小値・最大値(int型)
	 * 戻り値：入力された数値(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	static int inputLimitatNumber(String desplayIssue, int lowerLimit, int upperLimit) {

		//入力内容の文言を表示
		System.out.print(desplayIssue);
		//入力された整数を読み込む
		int integralNumber = standardInput.nextInt();

		//範囲外の値が入力された場合
		while (integralNumber > upperLimit || integralNumber < lowerLimit) {
			//指定範囲内での入力を促す。
			System.out.println(lowerLimit + "～" + upperLimit + "の範囲で入力してください。");
			//入力内容の文言を表示
			System.out.print(desplayIssue);
			//再度入力された整数を読み込む
			integralNumber = standardInput.nextInt();
		}

		//入力された整数を返却
		return integralNumber;
	}

	/*
	 * メソッド名：main
	 * 概要:ロボットペットクラスをテストする
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public static void main(String[] args) {

		//できる家事の中の最小番号を定数化
		final int MINIMUMU_HOUSEWORK_NUMBER = 0;
		//できる家事の中の最大番号を定数化
		final int MAXIMUM_HOUSEWORK_NUMBER = 2;

		//ロボットペットの名前の入力を促す
		//入力された名前を読み込む
		String petName = inputString("ロボットペットの名前：");
		//飼い主の名前の入力を促す
		//入力された名前を読み込む
		String masterName = inputString("飼い主の名前を入力して下さい。");
		//ロボットペットのインスタンスを生成
		RobotPet robotPet = new RobotPet(petName, masterName);
		//ロボットの自己紹介
		robotPet.introducePet();
		//実行させたい家事を選択させる
		int chooseWork = inputLimitatNumber("実行させる家事を選択してください。"
				+ "\n(0…掃除/1…洗濯/2…炊事)：", MINIMUMU_HOUSEWORK_NUMBER, MAXIMUM_HOUSEWORK_NUMBER);
		//ロボットの家事の実行
		robotPet.doHouseWork(chooseWork);
		//衣装の選択を迫る
		System.out.print("衣装を選択してください。\n(0…漆黒/1…深紅/2…露草/3…柳葉/4…ヒョウ柄/それ以外…無地)：");
		//衣装の選択をさせる
		int chooseCostume = standardInput.nextInt();
		//ロボットの衣装を着せ替える
		robotPet.changeSkin(chooseCostume);
	}
}
