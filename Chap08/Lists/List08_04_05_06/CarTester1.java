package Chap08.Lists.List08_04_05_06;

/*
* クラス名:CarTester1
* 概要:自動車のクラス【第一版】の利用例(その1)
* 作成者:S.Hiruta
* 作成日:2024/05/09
*/
public class CarTester1 {

	/*
	 * 関数名：main
	 * 概要:2種類の車の車幅・車高・車長の情報を表記
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/22
	*/
	public static void main(String[] args) {
		//
		Car vitz = new Car("ビッツ", 1660, 1500, 3640, 40.0);
		//
		Car march = new Car("マーチ", 1660, 1525, 3695, 41.0);
		
		//
		vitz.putSpec();
		//
		System.out.println();
		//
		march.putSpec();
	}

}
