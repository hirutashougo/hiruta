package janken;

//Randomのインポート
import java.util.Random;

/*
* クラス名:ComputerPlayer
* 概要：ジャンケンをするコンピューターのプレイヤーを表す
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public class ComputerPlayer extends Player {

	//Randomクラスの変数の定義
	static Random randomNumber = new Random();

	//ジャンケンの手を表すフィールドを宣言
	private int playSelection = 0;

	//ジャンケンの手数を表す定数を定義
	private final int SELECTION_COUNT = 3;

	/*
	 * コンストラクタ名：ComputerPlayer
	 * 概要:ジャンケンの手を生成する
	 * 引数：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public ComputerPlayer() {
		//ジャンケンの手を表すフィールドを、生成された乱数の値で初期化
		this.playSelection = randomNumber.nextInt(SELECTION_COUNT);
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
