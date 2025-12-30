package curriculum.k;

//⑦オブジェクト指向の設計原則
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Payable> staff = new ArrayList<>();

		//↓↓人員現況に変化があり次第対応させる↓↓

		staff.add(new FullTimeEmployee("田中", "F001", 160));
		staff.add(new ContractEmployee("佐藤", "C002", 140));

		//ポリモーフィズム
		SalaryReporter reporter = new SalaryReporter();

		//リスト内全員分の給与をレポーターを呼び出す
		for (Payable p : staff) {
			reporter.report(p);
		}
	}
}
