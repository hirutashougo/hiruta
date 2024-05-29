package pet;

/*
* クラス名:Pet
* 概要：ペットに関する情報を管理する
* 作成者:S.Hiruta
* 作成日:2024/05/29
*/
public class Pet {

	//ペットの名前のフィールドを宣言
	private String petName = "";
	//飼い主の名前フィールドを宣言
	private String masterName = "";
	
	/*
	 * コンストラクタ名：Pet
	 * 概要:ペットに関する情報を生成
	 * 引数：ペットの名前,飼い主の名前(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public Pet(String petName, String masterName) {
		//ペットの名前を初期化
		this.petName = petName;
		//飼い主の名前を初期化
		this.masterName = masterName;
	}
	
	/*
	 * メソッド名：getPetName
	 * 概要:ペットの名前を取得する	 
	 * 引数：なし
	 * 戻り値：ペットの名前(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public String getPetName() {
		//ペットの名前を返却
		return petName;
	}
	
	/*
	 * メソッド名：getPetName
	 * 概要:飼い主の名前を取得する	 
	 * 引数：なし
	 * 戻り値：飼い主の名前(String型)
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public String getMasterName() {
		//飼い主の名前を返却
		return masterName;
	}
	
	/*
	 * メソッド名：introducePet
	 * 概要:ペットに関する情報を紹介する
	 * 引数：なし
	 * 戻り値：なし
	 * 作成者：S.Hiruta
	 * 作成日：2024/05/29
	*/
	public void introducePet() {
		//ペットの名前を紹介
		System.out.println("■僕の名前は" + petName + "です。");
		//飼い主の生を紹介
		System.out.println("■ご主人様は" + masterName + "です。");
	}
}
