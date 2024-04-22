package Chap07.Lists;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:List07_08
* 概要:右下が直角の直角三角形を表示
* 作成者:S.Hiruta
* 作成日:2024/04/22
*/
public class List07_08 {
	
	/*
	 * 関数名：putChars
	 * 概要:引数個分の文字を表示する
	 * 引数:文字(char型),整数(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	static void putChars (char c, int n) {
		//引数n(教科書準拠)の回数分の文字c(教科書準拠)を表示する
		while (n-- > 0) {
		//文字cを表示する
			System.out.print(c);
		}
	}

	/*
	 * 関数名：main
	 * 概要:右下が直角の直角三角形を表示
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
		
		//入力された段数分の直角三角形を表示する
		for (int i =  0; i <= stepCount; i++) {
			//記号「*」を表示するため、関数putChars呼び出す
			putChars(' ', stepCount - i);
			//空白「 」を表示するため、関数putChars呼び出す
			putChars('*', i);
			//段が「 」と「*」で埋まったら一段繰り下げる
			System.out.println();
		}
	}

}
