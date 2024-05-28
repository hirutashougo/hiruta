package janken;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:HumanPlayer
* 概要：ジャンケンをする人間のプレイヤーを表す
* 作成者:S.Hiruta
* 作成日:2024/05/27
*/
public class HumanPlayer extends Player {

	//Scannerクラスの変数の定義
	static Scanner standardInput = new Scanner(System.in);

	//ジャンケンの手を表すフィールドを宣言
	private int playSelection = 0;

	//ジャンケンのグーを表す定数を定義
	private final int ROCK_NUMBER = 0;
	//ジャンケンのチョキを表す定数を定義
	private final int SCISSORS_NUMBER = 1;
	//ジャンケンのパーを表す定数を定義
	private final int PAPER_NUMBER = 2;

	/*
	 * コンストラクタ名：HumanPlayer
	 * 概要:ジャンケンの手を生成する
	 * 引数：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/27
	*/
	public HumanPlayer() {
		//ジャンケンの手の入力を促す
		System.out.print("ジャンケン(0…グー/1…チョキ/2…パー)：");
		//入力された手を読み込む
		int playSelection = standardInput.nextInt();
		//提示した選択肢以外から入力された場合
		while (playSelection != ROCK_NUMBER && playSelection != SCISSORS_NUMBER && playSelection != PAPER_NUMBER) {
			//提示した選択肢の中から選んで入力するように促す
			System.out.println("0・1・2のどれかで入力してください。");
			//再度、ジャンケンの手の入力を促す
			System.out.print("ジャンケン(0…グー/1…チョキ/2…パー)：");
			//入力された手を読み込む
			playSelection = standardInput.nextInt();
		}
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
