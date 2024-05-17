package Chap10.Lists;

/*
* クラス名:Math
* 概要:数学の様々な定数に関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/16
*/
public final class Math {
	
	//自然対数の底eに最も近い値ouble値
	public static final double E = 2.7182818284590452354;
	
	//円周とその直径の比πに最も近いdouble値
	public static final double PI = 3.14159265358979323846;
	
	/*
	 * 関数名：isLeapYear
	 * 概要:入力された年がうるう年か判定
	 * 引数：年数(int型)
	 * 戻り値：うるう年かどうかの判定(true, false)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/
	final static double calculateAbsoluteValue (double inputNumber) {
		//入力された値が負の場合、符号を正に直して返却
		return (inputNumber <= 0.0D) ? 0.0D -inputNumber: inputNumber;
	}
	
	/*
	 * 関数名：isLeapYear
	 * 概要:入力された年がうるう年か判定
	 * 引数：年数(int型)
	 * 戻り値：うるう年かどうかの判定(true, false)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/16
	*/

}
