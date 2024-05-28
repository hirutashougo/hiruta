package Chap13.Exercises;

//Scannerをインポート
import java.util.Scanner;

//
import janken.ComputerPlayer;
//
import janken.HumanPlayer;
//
import janken.Player;

/*
* クラス名:ShapeTester
* 概要:ジャンケンクラス群をテストする
* 作成者:S.Hiruta
* 作成日:2024/05/28
*/
public class JankenTester {

	//Scannerクラスの変数を設定
	static Scanner standardInput = new Scanner(System.in);

	//人間vs人間の選択を表す定数を宣言
	static final int HUMAN_VERSUS_HUMAN = 0;
	//人間vsコンピュータの選択を表す定数を宣言
	static final int HUMAN_VERSUS_COMPUTER = 1;
	//コンピュータvsコンピュータの選択を表す定数を宣言
	static final int COMPUTER_VERSUS_COMPUTER = 2;

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
	 * メソッド名：main
	 * 概要:ジャンケンクラス群をテストする
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/28
	*/
	public static void main(String[] args) {

		//ジャンケンプレイヤーの人数を定数化
		final int PLAYER_COUNT = 2;
		//一人目のプレイヤーの情報を格納する要素のインデックス数を定数化
		final int FIRST_PLAYER_INDEX = 0;
		//二人目のプレイヤーの情報を格納する要素のインデックス数を定数化
		final int SECOND_PLAYER_INDEX = 1;

		//ジャンケンの勝ちを表す定数を定義
		final int WIN_GAME = 0;
		//ジャンケンの負けを表す定数を定義
		final int LOSE_GAME = 1;
		//ジャンケンの引き分けを表す定数を定義
		final int DRAW_GAME = 2;

		//ジャンケンプレイヤーたちの情報を格納する配列を宣言
		Player[] gamePlayer = new Player[PLAYER_COUNT];

		//ジャンケンを行いことを伝える
		System.out.println("ジャンケンを行います。");

		//一人目のプレイヤー(使用者)を人間かコンピュータのどちらにするか選択させる
		//人間の場合
		if (isTrueFalse("人間として戦いますか？")) {
			//人間プレイヤーのインスタンスを生成する
			gamePlayer[FIRST_PLAYER_INDEX] = new HumanPlayer();
		//コンピュータの場合
		} else {
			//コンピュータプレイヤーのインスタンスを生成する
			gamePlayer[FIRST_PLAYER_INDEX] = new ComputerPlayer();
		}

		//二人目のプレイヤーを人間かコンピュータのどちらにするか選択させる
		//人間の場合
		if (isTrueFalse("人間と戦いますか？")) {
			//人間プレイヤーのインスタンスを生成する
			gamePlayer[SECOND_PLAYER_INDEX] = new HumanPlayer();
		//コンピュータの場合
		} else {
			//コンピュータプレイヤーのインスタンスを生成する
			gamePlayer[SECOND_PLAYER_INDEX] = new ComputerPlayer();
		}

		//ジャンケンの継続を決める変数を宣言
		boolean judgeContinue = true;

		//勝敗が決まるまでジャンケンを続ける
		do {
			//一人目がなんの手を出したのか表示する
			System.out.println("あなた  ：" + gamePlayer[FIRST_PLAYER_INDEX].printHand());
			//二人目がなんの手を出したのか表示する
			System.out.println("対戦相手：" + gamePlayer[SECOND_PLAYER_INDEX].printHand());
			//一人目のプレイヤーの、二人目に対する勝敗結果によって処理を分岐
			switch (gamePlayer[FIRST_PLAYER_INDEX].playGeme(gamePlayer[SECOND_PLAYER_INDEX])) {
			//ジャンケンに勝利した場合
			case WIN_GAME:
				//勝利を伝える
				System.out.println("勝利");
				//ジャンケンを終了するように設定
				judgeContinue = false;
				//処理を終える
				break;
			//ジャンケンに敗北した場合
			case LOSE_GAME:
				//敗北を伝える
				System.out.println("敗北");
				//ジャンケンを終了するように設定
				judgeContinue = false;
				//処理を終える
				break;
			//ジャンケンに引き分けた場合
			case DRAW_GAME:
				//愛子を伝える
				System.out.println("あいこ");
				//一人目のプレイヤー(使用者)が人間である場合
				if (gamePlayer[FIRST_PLAYER_INDEX] instanceof HumanPlayer) {
					//ジャンケンの手を再入力させる
					System.out.println("もう一度、あなたの手を決めてください。");
					//入力された手を読み込む
					gamePlayer[FIRST_PLAYER_INDEX] = new HumanPlayer();
				}
				//二人目のプレイヤーが人間である場合
				if (gamePlayer[SECOND_PLAYER_INDEX] instanceof HumanPlayer) {
					//ジャンケンの手を再入力させる
					System.out.println("もう一度、対戦相手の手を決めてください。");
					//入力された手を読み込む
					gamePlayer[SECOND_PLAYER_INDEX] = new HumanPlayer();
				//二人目のプレイヤーが人間である場合
				} else if (gamePlayer[SECOND_PLAYER_INDEX] instanceof ComputerPlayer) {
					//もう一度ジャンケンの手を生成させる
					gamePlayer[SECOND_PLAYER_INDEX] = new ComputerPlayer();
				}
			}
		//引き分けである限りジャンケンは続く
		} while (judgeContinue);
	}
}
