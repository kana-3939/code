package curriculum.g;

//③カプセル化
public class Main {
	public static void main(String[] args) {
		// Employeeクラスをインポート
		//※同じパッケージ内ならインポート不要
		Employee employee2 = new Employee();

		// setterで値をセット
		employee2.setEmployeeId("E002");
		employee2.setName("田中　花子");

		// getterで値を取得して表示
		System.out.println("社員ID：" + employee2.getEmplyeeId() + ",名前：" + employee2.getName());
	}

}
