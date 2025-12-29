package curriculum.j;

//⑥インターフェイスと抽象クラス 
public interface Billable {
	//インターフェイス Billable …「請求可能」な振る舞いの抽象。
	public int costForDay(int hoursWorked);

	//名前や社員IDを返す　！！Employeeクラスのみではエラー！！
	public String getName();

	public String getId();

}
