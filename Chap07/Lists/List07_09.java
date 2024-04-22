package Chap07.Lists;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:List07_09
* 概要:長方形と正方形を表示
* 作成者:S.Hiruta
* 作成日:2024/04/22
*/
public class List07_09 {

	/*
	 * 関数名：putStars
	 * 概要:引数個分の文字を表示する
	 * 引数:文字(char型),整数(int型)
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
	 * 関数名：putSquare
	 * 概要:文字'＋'を並べて一辺の長さがn個の正方形を表示
	 * 引数:整数(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	static void putSquare(int n) {
		//n(教科書準拠)個分の文字'＋'を表示する
		for (int i = 1; i <= n; i++) {
			//関数putCharsを呼び出し、文字'＋'をn個表示する
			putChars('＋', n);
			//文字'＋'を表示し終わったら、改行を行う
			System.out.println();
		}
	}

	/*
	 * 関数名：putRectangle
	 * 概要:文字'＊'を並べて高さhで幅がwの長方形を表示
	 * 引数:整数(int型)
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	static void putRectangle(int w, int h) {
		//引数n(教科書準拠)の回数分の文字'＋'を表示する
		for (int i = 1; i <= h; i++) {
			//関数putCharsを呼び出し、文字'＊'をw個表示する
			putChars('＊', w);
			//文字'＊'を表示し終わったら、改行を行う
			System.out.println();
		}
	}

	/*
	 * 関数名：main
	 * 概要:長方形と正方形を表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	public static void main(String[] arg) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//正方形を表示する
		//これから正方形を表示すると伝える
		System.out.println("正方形を表示します。");
		//一辺の長さの入力を促す。
		System.out.print("一辺は：");
		//入力された一辺の長さを読み込む
		int sideLength = standardInput.nextInt();
		//一辺の長さが正の整数で入力されるようにする
		while (sideLength <= 0) {
			//一辺の長さを正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//改めて、一辺の長さの入力を促す。
			System.out.print("一辺は：");
			//入力された一辺の長さを読み込む
			sideLength = standardInput.nextInt();
		}
		//入力された一辺の長さを持つ正方形を表示する
		putSquare(sideLength);
		
		//長方形を表示する
		//これから長方形を表示すると伝える
		System.out.println("長方形を表示します。");
		//一辺の高さの入力を促す。
		System.out.print("高さは：");
		//入力された高さを読み込む
		int rectangleHeigth = standardInput.nextInt();
		//高さが正の整数で入力されるようにする
		while (rectangleHeigth <= 0) {
			//高さを正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//改めて、高さの入力を促す。
			System.out.print("高さは：");
			//入力された高さを読み込む
			rectangleHeigth = standardInput.nextInt();
		}
		//これから長方形を表示すると伝える
		System.out.println("長方形を表示します。");
		//一辺の幅の入力を促す。
		System.out.print("幅は：");
		//入力された幅を読み込む
		int rectangleWidth = standardInput.nextInt();
		//幅が正の整数で入力されるようにする
		while (rectangleWidth <= 0) {
			//幅を正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//改めて、幅の入力を促す。
			System.out.print("幅は：");
			//入力された幅を読み込む
			rectangleWidth = standardInput.nextInt();
		}
		//入力された高さと幅を持つ長方形を表示する
		putRectangle(rectangleHeigth,rectangleWidth);
	}

}
