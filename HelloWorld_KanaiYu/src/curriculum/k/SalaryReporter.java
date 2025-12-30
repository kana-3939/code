package curriculum.k;

//⑦オブジェクト指向の設計原則
public class SalaryReporter {
	//給与の報告する文言のメソッド
	public void report(Payable p) {
		System.out.println("社員ID：" + p.getId() + " " + p.getName() + "さんの給料は " + p.calculateSalary() + " 円です");
	}
}
