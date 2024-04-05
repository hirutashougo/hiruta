package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_07
 * 概要:読み込んだ整数値を3で割った結果を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_07 {
	
	/*
	 *関数名:main
	 *概要:読み込んだ整数値を3で割った結果を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		
		//正の整数値の入力および読み込み
		System.out.print("正の整数を入力してください:");
		
		//入力された整数の読み込み
		int integralNumber = standardInput.nextInt();
		
		
		//２つの条件による処理の分岐
		//①入力された整数が0よりも大きい場合
		if ( integralNumber > 0 ) {
			
			//3つの条件による処理の分岐
			//①入力された整数が上記の条件であり、なおかつ3の倍数である場合
			if ( integralNumber % 3 == 0 ) {
				
				//入力された値は3で割り切れる事を伝える
				System.out.println("その値は3で割り切れます。");
			}
			
			//②入力された整数が上記の条件であり、なおかつ3の商が1である場合
			else  if ( integralNumber % 3 == 1 ) {
				
				//入力された整数の3の商が1である事を伝える
				System.out.println("その値を3で割った余りは1です。");
			}
			
			//③入力された整数が上記の条件であり、なおかつ3の商が1である場合
			else {
				
				//入力された整数の3の商が2である事を伝える
				System.out.println("その値を3で割った余りは2です。");
			}
			
		}
		
		//②入力された整数が0よりも小さい場合
		else {
			
			//正ではない値が入力されたことを伝える
			System.out.println("正ではない値が入力されました。");
		}

	}

}
