package Chap03;

//二つの変数を小さい順にソート

//スキャナのインポート
import java.util.Scanner;

//クラスの宣言
public class Chap03_List_3_14 {
	//mainメソッドの宣言
	public static void main(String[] arg) {
		//入力ストリームの指定
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a:");  int a = stdIn.nextInt();  //整数aの入力を促し、読み込む
		System.out.print("整数b:");  int b = stdIn.nextInt();  //整数bの入力を促し、読み込む
		
		if ( a > b ) {   //aがbより大きい場合
			int t = a;
			a = b;
			b = t;
		}
		
		//結果の表示
		System.out.println("a≦bとなるようにソートしました。" );
		System.out.println("変数aは" + a + "です。" );
		System.out.println("変数bは" + b + "です。" );
		
	}
	
}