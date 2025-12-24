package curriculum.f;

//②クラスとオブジェクト
public class Employee {
	//employeeId(文字列型)フィールド
	String employeeId;
	//name(文字列型)フィールド
	String name;

	//showInfoメソッドで社員ID：、名前：と出力する
	public void showInfo() {
		System.out.println("社員ID:" + employeeId + "," + "名前:" + name);
	}
}
