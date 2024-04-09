package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_05
 * 読み込んだ正の整数値が5で割り切れるかどうか判定
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_05 {
	
	/*
	 *関数名:main
	 *読み込んだ正の整数値が5で割り切れるかどうか判定
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		Scanner stadardInput = new Scanner(System.in);
		
		//正の整数値の入力および読み込み
		System.out.print("正の整数を入力してください:"); int integralNumber = stadardInput.nextInt();
		
		//２つの条件分けによる分岐
		//①入力された整数が0よりも大きい場合
		if ( integralNumber > 0 ) {
			
			//２つの条件分けによる分岐
			//①-①入力された整数が上記の条件であり、なおかつ5で割り切れる場合
			if ( integralNumber % 5 == 0 ) {
				
				//入力された整数が5で割り切れることを伝える。
				System.out.println("その値は5で割り切れます。");
			}
			
			//①-②入力された整数が上記の条件であり、なおかつ5で割り切れない場合  
			else {
				
				//入力された整数が5で割り切れないことを伝える。
				System.out.println("その値は5で割り切れません。");
			}
		}
		
		//②入力された整数が0よりも小さい場合
		else {
			//入力された整数が正ではないことを伝える
			System.out.println("正ではない値が入力されました。");
		}

	}

}
