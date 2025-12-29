package curriculum.j;

//⑥インターフェイスと抽象クラス 
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//リストをつくる
		List<Billable> billableList = new ArrayList<>();
		//メンバーを追加する
		billableList.add(new FullTimeEmployee("F001", "田中花子"));
		billableList.add(new ContractEmployee("C001", "佐藤太郎"));
		billableList.add(new FullTimeEmployee("F002", "小林次郎"));

		//労働時間を代入
		int hoursWorked = 9;

		//メンバー全員の給与を表示させる
		for (Billable e : billableList) {
			int cost = e.costForDay(hoursWorked);
			System.out.println("社員ID: " + e.getId() + " 名前: " + e.getName() + "給与: " + cost + " 円");
		}
	}
}
