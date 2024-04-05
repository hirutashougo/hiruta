package Chap03.Exercises;

//Scannerの読み込み
import java.util.Scanner;

/*
 * クラス名:Exercise03_08
 * 概要:読み込んだ点数の成績を表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/02
 */
public class Exercise03_08 {
	
	/*
	 *関数名:main
	 *概要:読み込んだ点数の成績を表示
	 *引数:なし
	 *戻り値:なし
	 *作成者:S.Hiruta
	 *作成日:2024/04/02
	 */
	public static void main(String[] args) {
		
		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);
		
		
		//点数の入力を促す
		System.out.print("成績を表示します。\n点数を入力してください(1～100):");
		
		
		//入力された点数を読み込む
		int scoreNumber = standardInput.nextInt();
		
		
		//4つの条件による分岐
		//①入力された点数が0以上59以下の場合
		if ( scoreNumber >= 0 && scoreNumber <= 59 ) {
			
			//不可の表示
			System.out.println("不可");
		}
		
		//②入力された点数が60以上69以下の場合
		else if ( scoreNumber >= 60 && scoreNumber <= 69 )  {
			
			//可の表示
			System.out.println("可");
		}
		
		//③入力された点数が70以上79以下の場合
		else if ( scoreNumber >= 70 && scoreNumber <= 79 ) {
			
			//良の表示
			System.out.println("良");
		}
		
		//④入力された点数が80以上100以下の場合
		else if ( scoreNumber >= 80 && scoreNumber <= 100 ) {
			
			//優の表示
			System.out.println("優");
		}

	}

}
