package Chap15.Exercises;

//Scannerをインポート
import java.util.Scanner;

//jankenパッケージのComputerPlayerクラスをインポート
import janken.ComputerPlayer;
//jankenパッケージのHumanPlayerクラスをインポート
import janken.HumanPlayer;
//jankenパッケージのPlayerクラスをインポート
import janken.Player;

/*
* クラス名:Exercise15_05
* 概要：3人でジャンケンを行い、それぞれの勝敗を表示
* 作成者:S.Hiruta
* 作成日:2024/05/30
*/
public class Exercise15_05 {

	//Scannerクラスの変数を設定
	static Scanner standardInput = new Scanner(System.in);

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
	 * 関数名：main
	 * 概要:3人でジャンケンを行い、それぞれの勝敗を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/30
	*/
	public static void main(String[] args) {

		//一人目の人間プレイヤーの情報を格納する要素のインデックス数を定数化
		final int FIRST_PLAYER_INDEX = 0;
		//一人目のコンピュータプレイヤーの情報を格納する要素のインデックス数を定数化
		final int FIRST_COMPUTER_PLAYER_INDEX = 1;
		//二人目のコンピュータプレイヤーの情報を格納する要素のインデックス数を定数化
		final int SECOND_COMPUTER_PLAYER_INDEX = 2;
		//ジャンケンプレイヤーの人数を定数化
		final int PLAYER_COUNT = 3;

		//ジャンケンプレイヤーたちの情報を格納する配列を宣言
		Player[] gamePlayer = new Player[PLAYER_COUNT];

		//三人でジャンケンを行う
		do {
			//ジャンケンを行いことを伝える
			System.out.println("ジャンケンを行います。\n");

			//一人目のプレイヤー(使用者)のインスタンスを生成
			gamePlayer[FIRST_PLAYER_INDEX] = new HumanPlayer();
			//二人目のプレイヤーのインスタンスを生成
			gamePlayer[FIRST_COMPUTER_PLAYER_INDEX] = new ComputerPlayer();
			//三人目のプレイヤーのインスタンスを生成
			gamePlayer[SECOND_COMPUTER_PLAYER_INDEX] = new ComputerPlayer();
			
			//見やすさのため改行
			System.out.println();
			
			//出した手を表示
			//1人目(人間)の手を表示
			System.out.println("1人目(人間)の手          ：" + gamePlayer[FIRST_PLAYER_INDEX].printHand());
			//2人目(コンピュータ)の手を表示
			System.out.println("2人目(コンピュータ)の手  ：" + gamePlayer[FIRST_COMPUTER_PLAYER_INDEX].printHand());
			//3人目(コンピュータ)の手を表示
			System.out.println("3人目(コンピュータ)の手  ：" + gamePlayer[SECOND_COMPUTER_PLAYER_INDEX].printHand());

			//見やすさのため改行
			System.out.println();
			
			//各プレイヤーの全体における勝敗結果(0…勝ち/1…負け/2…引き分け)を表す数値を変数に格納
			//1人目(人間)の勝敗結果
			int firstPlayerResult = gamePlayer[FIRST_PLAYER_INDEX].playThreeWayGame(gamePlayer[FIRST_PLAYER_INDEX],
					gamePlayer[FIRST_COMPUTER_PLAYER_INDEX],
					gamePlayer[SECOND_COMPUTER_PLAYER_INDEX]);
			//2人目(コンピュータ)の勝敗結果
			int secondPlayerResult = gamePlayer[FIRST_COMPUTER_PLAYER_INDEX].playThreeWayGame(gamePlayer[FIRST_COMPUTER_PLAYER_INDEX],
					gamePlayer[SECOND_COMPUTER_PLAYER_INDEX],
					gamePlayer[FIRST_PLAYER_INDEX]);
			//3人目(コンピュータ)の勝敗結果
			int thirdPlayerResult = gamePlayer[SECOND_COMPUTER_PLAYER_INDEX].playThreeWayGame(gamePlayer[SECOND_COMPUTER_PLAYER_INDEX],
					gamePlayer[FIRST_PLAYER_INDEX],
					gamePlayer[FIRST_COMPUTER_PLAYER_INDEX]);

			//全体における勝敗結果を表示
			//1人目(人間)の全体における勝敗
			System.out.println("1人目(人間)の勝敗        ：" + gamePlayer[FIRST_PLAYER_INDEX].printWinOrLose(firstPlayerResult));
			//2人目(コンピュータ)の全体における勝敗
			System.out.println("2人目(コンピュータ)の勝敗：" + gamePlayer[FIRST_COMPUTER_PLAYER_INDEX].printWinOrLose(secondPlayerResult));
			//3人目(コンピュータ)の全体における勝敗
			System.out.println("3人目(コンピュータ)の勝敗：" + gamePlayer[SECOND_COMPUTER_PLAYER_INDEX].printWinOrLose(thirdPlayerResult));

			//見やすさのため改行
			System.out.println();
			
			//ジャンケンを続けるか選択させる
		} while (isTrueFalse("もう一度?："));
	}

}
