package Chap06.Lists;

/*
 * クラス名:List06_18
 * 概要:凹凸な2次元配列を生成する
 * 作成者:S.Hiruta
 * 作成日:2024/04/18
 */
public class List06_18 {

	/*
	 * 関数名：main
	 * 概要:凹凸な2次元配列を生成する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/04/18
	*/
	public static void main(String[] arg) {
//		//
//		int[][] c;
//		//
//		c = new int[3][];
//		//
//		c[0] = new int[5];
//		//
//		c[1] = new int[3];
//		//
//		c[2] = new int[4];
		
		//
		int [][] c = {new int[5], new int[3], new int[4],};
		
		//
		for (int i = 0; i < c.length; i++) {
			//
			for (int j = 0; j < c[i].length; j++) {
				//
				System.out.printf("%3d", c[i][j]);
			}
			//
			System.out.println();
		}
		
		System.out.print(c.length);
	}
}
