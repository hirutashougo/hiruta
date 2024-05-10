package Chap08.Exercises.Exsercise08_01;

//Scannerのインポート
import java.util.Scanner;

/*
* クラス名:HumanTester
* 概要:入力された、名前・身長・体重、算出されるBMIの情報を表示する
* 作成者:S.Hiruta
* 作成日:2024/05/09
*/
public class HumanTester {

	/*
	 * 関数名：main
	 * 概要:入力された、名前・身長・体重、算出されるBMIの情報を表示する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/09
	*/
	public static void main(String[] args) {

		//Scannerクラスの変数の定義
		Scanner standardInput = new Scanner(System.in);

		//名前の入力を促す
		System.out.println("名前を入力してください。");
		//名前の入力を促す
		System.out.print("名前は：");
		//入力くされた名前を読み込む
		String nameData = standardInput.next();
		//身長の入力を促す
		System.out.println("身長を入力してください。：");
		//身長の入力を促す
		System.out.print("身長(cm)は：");
		//入力された身長を読み込む
		double heigthData = standardInput.nextDouble();
		//身長が正の整数で入力されるまで繰り返す
		while (heigthData <= 0) {
			//正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//改めて身長の入力を促す
			System.out.print("身長(cm)は：");
			//入力された慎重を読み込む
			heigthData = standardInput.nextDouble();
		}
		//体重の入力を促す
		System.out.println("体重を入力してください：");
		//体重の入力を促す
		System.out.print("体重(kg)は：");
		//入力され体重を読み込む
		double weightData = standardInput.nextDouble();
		//体重が正の整数で入力されるまで繰り返す
		while (weightData <= 0) {
			//正の整数で入力するように促す
			System.out.println("正の整数で入力してください。");
			//改めて体重の入力を促す
			System.out.print("体重(kg)は：");
			//入力された体重を読み込む
			weightData = standardInput.nextDouble();
		}

		//利用者の「人間クラス」のインスタンスを作成する
		Human personalInformation = new Human(nameData, heigthData, weightData);

		//関数putSpecを呼び出して入力された情報と、そこから算出されるbmiを表示する
		personalInformation.putSpec();
	}

}