package curriculum.f;

//②クラスとオブジェクト
public class Main {
	public static void main(String[] args) {
		//インスタンスを作成
		Employee employee1 = new Employee();
		//employeeIdにE001を代入
		employee1.employeeId = "E001";
		//nameに佐藤太郎を設定
		employee1.name = "佐藤太郎";
		//呼び出して出力を確認する
		employee1.showInfo();
	}

}
