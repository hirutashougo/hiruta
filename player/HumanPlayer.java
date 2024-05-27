package player;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:HumanPlayer
* 概要：ジャンケンをする人間のプレイヤーを表す
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public class HumanPlayer extends Player{
	
	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);
	
	//ジャンケンの手を表すフィールドを宣言
	private int playSelection = 0;
	
	/*
	 * コンストラクタ名：HumanPlayer
	 * 概要:ジャンケンの手を生成する
	 * 引数：ジャンケンの手を表す数字(0…グー/1…チョキ/2…パー)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public HumanPlayer(int playSelection) {
		//
		System.out.print("ジャンケン(0…グー/1…チョキ/2…パー)：");
		//
		
		//ジャンケンの手を表すフィールドを、入力されるあたいで初期化
		this.playSelection = playSelection;
	}
	
	/*
	 * メソッド名：getSelection
	 * 概要:ジャンケンを手を取得する	 
	 * 引数：なし
	 * 戻り値：ジャンケンの手を表す数字(0…グー/1…チョキ/2…パー)(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public int getSelection() {
		//ジャンケンの手を表す数字を返却
		return playSelection;
	}
}
