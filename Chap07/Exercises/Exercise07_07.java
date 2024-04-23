package Chap07.Exercises;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:Exercise07_07
* 概要:左下が直角の直角三角形を表示
* 作成者:S.Hiruta
* 作成日:2024/04/22
*/
public class Exercise07_07 {

	/*
	 * 関数名：putChars
	 * 概要:引数個分の文字を表示する
	 * 引数:文字(char型),文字の個数(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	static void putChars(char c, int n) {
		//引数n(教科書準拠)の回数分の文字c(教科書準拠)を表示する
		while (n-- > 0) {
			//文字cを表示する
			System.out.print(c);
		}
	}

	/*
	 * 関数名：putStars
	 * 概要:引数個分の文字'*'を表示する
	 * 引数:文字'*'の個数(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	static void putStars(int n) {
		/*関数putCharsを呼び出し、
		  引数n(教科書準拠)個分の'*'を表示する*/
		putChars('*', n);
	}

	/*
	 * 関数名：main
	 * 概要:左下が直角の直角三角形を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	public static void main(String[] arg) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//これから左下が直角の直角三角形を表示すると伝える
		System.out.println("左下直角の直角三角形を表示します。");
		//段数の入力を促す
		System.out.print("段数は：");
		//入力された段数を読み込む
		int stepCount = standardInput.nextInt();
		//段数が正の整数で入力されるようにする
		while (stepCount <= 0) {
			//段数を正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//改めて、段数の入力を促す。
			System.out.print("段数は：");
			//入力された段数を読み込む
			stepCount = standardInput.nextInt();
		}

		//入力された段数分の直角三角形を表示する
		for (int i = 0; i <= stepCount; i++) {
			//記号「＊」を表示するため、関数putStarsw呼び出す
			putStars(i);
			//段が「＊」で埋まったら一段繰り下げる
			System.out.println();
		}
	}

}
