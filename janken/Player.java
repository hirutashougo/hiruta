package janken;

/*
* クラス名:Player
* 概要：ジャンケンをするプレイヤーを表す抽象クラス
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
	 * 概要:ジャンケンを手を表す数字(0…グー/1…チョキ/2…パー)を取得する	 
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
	 * メソッド名：returnsciScissorsResult
	 * 概要:グーに対しての各手の勝敗結果を返却する
	 * 引数：ジャンケンの手を表す数字(0…グー/1…チョキ/2…パー)(int型)
	 * 戻り値：グーに対する勝敗結果(0…勝ち/1…負け/2…引き分け)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public int returnsciScissorsResult(int playSelection) {
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
	 * 引数：対戦相手のプレイヤー(Player型)
	 * 戻り値：自分(プレイヤーインスタンス)の、対戦相手に対する勝敗結果(0…勝ち/1…負け/2…引き分け)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public int playGeme(Player gamePlayer) {
		//勝敗結果の数値を格納する変数を宣言
		int gameResult = 0;
		//自分(プレイヤーインスタンス)がグーの場合
		if (getSelection() == ROCK_NUMBER) {
			//グーに対する勝敗結果を求める
			gameResult = returnRockResult(gamePlayer.getSelection());
		//自分(プレイヤーインスタンス)がチョキの場合
		} else if (getSelection() == SCISSORS_NUMBER) {
			//チョキに対する勝敗結果を求める
			gameResult = returnsciScissorsResult(gamePlayer.getSelection());
		//自分(プレイヤーインスタンス)がパーの場合
		} else if (getSelection() == PAPER_NUMBER) {
			//パーに対する勝敗結果を求める
			gameResult = returnPaperResult(gamePlayer.getSelection());
		}
		//勝敗結果の数値を返却する
		return gameResult;
	}
	
	/*
	 * メソッド名：printHand
	 * 概要:ジャンケンの手を表す文字列を返却する
	 * 引数：なし
	 * 戻り値：ジャンケンの手を表す文字列(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/28
	*/
	public String printHand() {
		//ジャンケンの手を表す文字列の変数を宣
		String handString = "";
		//ジャンケンの手を表す数字によって表示を行う
		switch(getSelection()) {
		//グーの場合
		case ROCK_NUMBER:
			//グーと表示
			handString = "グー";
			//処理を終了
			break;
		//チョキーの場合
		case SCISSORS_NUMBER:
			//チョキと表示
			handString = "チョキ";
			//処理を終了
			break;
		//パーの場合
		case PAPER_NUMBER:
			//パーと表示
			handString = "パー";
			//処理を終了
			break;
		}
		//ジャンケンの手を表す文字列を返却
		return handString;
	}
}
