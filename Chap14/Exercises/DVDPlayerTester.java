package Chap14.Exercises;

//Scannerをインポート
import java.util.Scanner;

//playerパッケージのDVDPlayerクラスを選択
import player.DVDPlayer;

/*
* クラス名:RobotPetTester
* 概要：ロボットペットクラスをテストする
* 作成者:S.Hiruta
* 作成日:2024/05/29
*/
public class DVDPlayerTester {

	//Scannerクラスの変数を設定
	static Scanner standardInput = new Scanner(System.in);

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
	 * 関数名：isTrueFalse
	 * 概要:0か1での入力をさせる。0ならfalse、1ならtrueを返却
	 * 引数：選択の文言(String型)
	 * 戻り値：true,false(boolean型)
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
			System.out.print("0か1で入力してください：");
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
	 * 関数名：inputIntegralNumber
	 * 概要:テキスト(String型)を入力させる
	 * 引数：入力内容の文言(String型)
	 * 戻り値：入力された文言(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/24
	*/
	public static void main(String[] args) {

		//ビデオの停止を表す定数を定義
		final int STOP_VIDEO = 1;
		//ビデオのスロー再生を表す定数を定義
		final int SLOW_PLAY_VIDEO = 2;

		//DVDプレイヤーのインスタンスを生成
		DVDPlayer myDVDPlayer = new DVDPlayer();

		//ビデオ操作を繰り返し行う
		do {
			//ビデオを再生する
			myDVDPlayer.playVideo();

			//DVDプレイヤーの操作を選択させる
			int chooseOperation = inputLimitatNumber("操作選択(1…停止/2…スロー再生)：", STOP_VIDEO, SLOW_PLAY_VIDEO);

			//ビデオの停止が選択された場合
			if (chooseOperation == STOP_VIDEO) {
				//ビデオを停止するために処理を抜ける
				break;
				//ビデオのスロー再生が選択された場合
			} else {
				//ビデオをスロー再生する
				myDVDPlayer.playSlow();
			}
			//ビデオの再生を行うか選択させる
		} while (isTrueFalse("ビデオ再生を続けますか?"));
		//ビデオを停止する
		myDVDPlayer.stopVideo();
	}

}
