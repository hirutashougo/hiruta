package Chap10.Exercises.Ex10_02;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:ExIdentificationTester
* 概要：ExIdentificationクラスをテストする
* 作成者：S.Hiruta
* 作成日:2024/05/17
*/
public class ExIdentificationTester {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	/*
	 * 関数名：inputPlusInteger
	 * 概要:1以上の整数を入力させる
	 * 引数：入力条件の文言(String型)
	 * 戻り値：1以上の整数(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/15
	*/
	static int inputPlusInteger(String desplayIssue) {

		//選択の文言を表示
		System.out.print(desplayIssue);

		//入力される整数を格納する変数を宣言
		int integralNumber = 0;
		//入力された整数を読み込む
		integralNumber = standardInput.nextInt();
		//入力された整数が0以下である場合
		while (integralNumber <= 0) {
			//1以上の整数での入力を促す
			System.out.print("1以上の整数で入力してください;");
			//入力された整数を読み込む
			integralNumber = standardInput.nextInt();
		}
		//1以上の整数を返却
		return integralNumber;
	}

	/*
	 * 関数名：isTrueFalse
	 * 概要:0か1での入力をさせる。0ならfalse、1ならtrueを返却
	 * 引数：選択の文言(String型)
	 * 戻り値：true,false(booolean型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/17
	*/
	static boolean isTrueFalse(String desplayIssue) {

		//選択の文言を表示
		System.out.print(desplayIssue + "[0…No/1…Yes]：");

		//選択結果を格納する変数を定義
		boolean judgeBoolean = true;

		//trueを返却する選択を表す定数を定義
		final int RETURN_TRUE = 1;
		//trueを返却する選択を表す定数を定義
		final int RETURN_FALSE = 0;

		//入力された選択を読み込む
		int judgementValue = standardInput.nextInt();
		//0か1が入力されるまで選択を迫る
		while (judgementValue != RETURN_TRUE && judgementValue != RETURN_FALSE) {
			//0か1での入力を促す
			System.out.print("0か1で入力してください。");
			//入力された選択を読み込む
			judgementValue = standardInput.nextInt();
		}
		//0が入力された場合、falseを返却値に格納
		if (judgementValue == RETURN_FALSE) {
			//falseを返却値に格納
			judgeBoolean = false;
		}

		//0か1(falseかtrue)の選択結果を返却する
		return judgeBoolean;
	}

	/*
	* クラス名:main
	* 概要:ExIdentificationをテストする
	* 作成者:S.Hiruta
	* 作成日:2024/05/17
	*/
	public static void main(String[] args) {

		//識別子を与える人数を入力させる
		int humanCount = inputPlusInteger("識別番号を与える人数を入力してください。\n何人：");

		//入力された人数分の識別番号を格納するIdentification型の配列を宣言
		ExIdentification[] humanAccount = new ExIdentification[humanCount];

		//識別子を付与した利用者の順番を格納する変数を宣言
		int countNumber = 0;
		//指定人数全員に識番号を付与していく
		for (int i = 0; i < humanCount; i++) {
			//それぞれに識別番号を付与していく
			humanAccount[i] = new ExIdentification();
			//利用者の順番を調整。何番目の利用者に対し、いくつの値を識別子として付与したか表示する
			System.out.println(++countNumber + "人目の利用者の識別番号は" + humanAccount[i].getIdentification() + "です。");
			//この時点で、最後に付与した識別子を表示するか選択させる
			if (isTrueFalse("最後に付与した識別子を表示しますか？")) {
				//最後に付与した識別番号を表示
				System.out.println(humanAccount[i]);
			}
			//振り分ける識別番号の間隔を変更するか選択させる
			if (isTrueFalse("振り分ける識別番号の間隔を変更しますか？")) {
				//識別番号の間隔の変更を反映
				humanAccount[i].setIntervalNumber();
			}
		}
	}
}
