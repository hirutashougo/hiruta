package player;

/*
* クラス名:Player
* 概要：ジャンケンをするプレイヤーを表す
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public abstract class Player {

	//ジャンケンのグーを表す定数を定義
	private final int ROCK_NUMBER = 0;
	//ジャンケンのチョキを表す定数を定義
	private final int SCISSORS_NUMBER = 1;
	//ジャンケンのパーを表す定数を定義
	private final int PAPER_NUMBER = 2;

	//ジャンケンの勝ちを表す定数を定義
	private final int WIN_GAME = 0;
	//ジャンケンの負けを表す定数を定義
	private final int LOSE_GAME = 1;
	//ジャンケンの引き分けを表す定数を定義
	private final int DRAW_GAME = 2;

	/*
	 * メソッド名：getSelection
	 * 概要:ジャンケンを手を取得する	 
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public abstract int getSelection();

	/*
	 * メソッド名：returnRockResult
	 * 概要:グーに対しての各手の勝敗結果を返却する
	 * 引数：ジャンケンの手を表す数字(0…グー/1…チョキ/2…パー)(int型)
	 * 戻り値：グーに対する勝敗結果(0…勝ち/1…負け/2…引き分け)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public int returnRockResult(int playSelection) {
		//勝敗結果の数値を格納する変数を宣言
		int gameResult = 0;
		//グーに対してグーの場合
		if (playSelection == ROCK_NUMBER) {
			//引き分けの結果を代入する
			gameResult = DRAW_GAME;
			//グーに対してチョキの場合
		} else if (playSelection == SCISSORS_NUMBER) {
			//勝ちの結果を代入する
			gameResult = WIN_GAME;
			//グーに対してパーの場合
		} else if (playSelection == PAPER_NUMBER) {
			//負けの結果を代入する
			gameResult = LOSE_GAME;
		}
		//勝敗結果の数値を返却する
		return gameResult;
	}

	/*
	 * メソッド名：returnsciSsorsResult
	 * 概要:グーに対しての各手の勝敗結果を返却する
	 * 引数：ジャンケンの手を表す数字(0…グー/1…チョキ/2…パー)(int型)
	 * 戻り値：グーに対する勝敗結果(0…勝ち/1…負け/2…引き分け)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public int returnsciSsorsResult(int playSelection) {
		//勝敗結果の数値を格納する変数を宣言
		int gameResult = 0;
		//チョキに対してチョキの場合
		if (playSelection == SCISSORS_NUMBER) {
			//引き分けの結果を代入する
			gameResult = DRAW_GAME;
			//チョキに対してパーの場合
		} else if (playSelection == PAPER_NUMBER) {
			//勝ちの結果を代入する
			gameResult = WIN_GAME;
			//チョキに対してグーの場合
		} else if (playSelection == ROCK_NUMBER) {
			//負けの結果を代入する
			gameResult = LOSE_GAME;
		}
		//勝敗結果の数値を返却する
		return gameResult;
	}

	/*
	 * メソッド名：returnPaperResult
	 * 概要:パーに対しての各手の勝敗結果を返却する
	 * 引数：ジャンケンの手を表す数字(0…グー/1…チョキ/2…パー)(int型)
	 * 戻り値：パーに対する勝敗結果(0…勝ち/1…負け/2…引き分け)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public int returnPaperResult(int playSelection) {
		//勝敗結果の数値を格納する変数を宣言
		int gameResult = 0;
		//パーに対してパーの場合
		if (playSelection == PAPER_NUMBER) {
			//引き分けの結果を代入する
			gameResult = DRAW_GAME;
			//パーに対してグーの場合
		} else if (playSelection == ROCK_NUMBER) {
			//勝ちの結果を代入する
			gameResult = WIN_GAME;
			//パーに対してチョキの場合
		} else if (playSelection == SCISSORS_NUMBER) {
			//負けの結果を代入する
			gameResult = LOSE_GAME;
		}
		//勝敗結果の数値を返却する
		return gameResult;
	}

	/*
	 * メソッド名：playGeme
	 * 概要:ジャンケンを行い、勝敗結果を返却する
	 * 引数：2人のプレイヤー(Player型)
	 * 戻り値：一人目の、二人目に対する勝敗結果(0…勝ち/1…負け/2…引き分け)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public int playGeme(Player firstGemePlayer, Player secondGemePlayer) {
		//勝敗結果の数値を格納する変数を宣言
		int gameResult = 0;
		//一人目がグーの場合
		if (firstGemePlayer.getSelection() == ROCK_NUMBER) {
			//グーに対する勝敗結果を求める
			gameResult = firstGemePlayer.returnRockResult(secondGemePlayer.getSelection());
			//一人目がチョキの場合
		} else if (firstGemePlayer.getSelection() == SCISSORS_NUMBER) {
			//チョキに対する勝敗結果を求める
			gameResult = firstGemePlayer.returnsciSsorsResult(secondGemePlayer.getSelection());
			//一人目がパーの場合
		} else if (firstGemePlayer.getSelection() == PAPER_NUMBER) {
			//パーに対する勝敗結果を求める
			gameResult = firstGemePlayer.returnPaperResult(secondGemePlayer.getSelection());
		}
		//勝敗結果の数値を返却する
		return gameResult;
	}
}
