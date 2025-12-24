package curriculum.e;

//①基本概念
public class Main {
	public static void main(String[] args) {
		//インスタンスを作成
		Employee employee1 = new Employee();
		//nameに山田太郎を設定
		employee1.name = "山田太郎";
		//呼び出して出力を確認する
		employee1.work();
	}
}
