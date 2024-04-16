package Chap04.Lists;

/*
 * クラス名:List4_25
 * 概要:整数値と実数値を読み込んで表示
 * 作成者:S.Hiruta
 * 作成日:2024/04/15
 */
public class List04_26 {

	/*
	 * 関数名：main
	 * 概要:整数値と実数値を読み込んで表示
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：hiruta
	 * 作成日：2024/04/15
	*/
	public static void main(String[] args) {
		System.out.printf("%d\n",    12345);
		System.out.printf("%3d\n",   12345);
		System.out.printf("%7d\n",   12345);
		System.out.println();
		
		System.out.printf("%5d\n",     123);
		System.out.printf("%05d\n",    123);
		System.out.println();
		
		System.out.printf("%d\n",   123579);
		System.out.printf("%o\n",   123579);
		System.out.printf("%x\n",   123579);
		System.out.printf("%X\n",   123579);
		System.out.println();
		
		System.out.printf("%f\n",    123.45);
		System.out.printf("%15f\n",  123.45);
		System.out.printf("%9.2f\n", 123.45);
		System.out.println();
		
		System.out.printf("XYZ\n");
		System.out.printf("%s\n",   "ABCDE");
		System.out.printf("%3s\n",  "ABCDE");
		System.out.printf("%10s\n", "ABCDE");
		System.out.println();
	}
}
