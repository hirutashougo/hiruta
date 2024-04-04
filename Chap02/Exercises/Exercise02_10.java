package Chap02.Exercises;
//Scannerの読み込み
import java.util.Scanner;
/*
 * クラス名:Exercise02_10
 * 概要:名前の姓と名を個別に読み込んで、挨拶を行う
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise02_10 {
	/*
	 *関数名:main
	 *概要:名前の姓と名を個別に読み込んで、挨拶を行う
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		//姓の入力を促す
		System.out.print("姓");
		//文字列を読み込む
		String familyName = standardInput.next();
		
		//名の入力を促す
		System.out.print("名");
		//文字列を読み込む
		String firstName = standardInput.next();
		
		//名前の出力
		System.out.println("こんにちは" + familyName + firstName +  "さん。");

	}

}
