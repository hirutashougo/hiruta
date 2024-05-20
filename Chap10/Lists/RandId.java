package Chap10.Lists;

//Randomのインポート
import java.util.Random;

/*
* クラス名:RandId
* 概要:
* 作成者:S.Hiruta
* 作成日:2024/05/20
*/
public class RandId {
	
	//Randomクラスの変数の定義
	static Random randomNumber = new Random ();
	
	//
	private static int counter;
	
	//
	private int id;
	
	static {
		//
		Random randomNumber = new Random();
		
		//
		counter = randomNumber.nextInt(10) * 100;
	}
	
	/*
	 * コンストラクタ名：RandId
	 * 概要：識別番号を1加算する
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public  RandId() {
		//識別番号を1加算する
		id = ++counter;
	}
	
	/*
	 * メソッド名：getId
	 * 概要:識別番号を取得
	 * 引数：なし
	 * 戻り値：識別番号(int型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/20
	*/
	public int getId() {
		//
		return id;
	}

}
