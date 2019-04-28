package TreamXiao.WarekiDate.util;

public enum WarekiUtil {

	showa("","","昭和","Ｓ","3"),
	hesei("","","平成","Ｈ","4"),
	reiwa("","","令和","Ｒ","5");

	/** ”開始年月日*/
	private String startYmd;
	/** ”終了年月日*/
	private String endYmd;
	/** ”和暦年漢字名称*/
	private String name;
	/** ”和暦年英字名*/
	private String simpleName1;
	/** ”和暦年数字名*/
	private String simpleName2;

	private WarekiUtil(String startYmd, String endYmd, String name, String simpleName1, String simpleName2) {
		this.startYmd = startYmd;
		this.endYmd = endYmd;
		this.name = name;
		this.simpleName1 = simpleName1;
		this.simpleName2 = simpleName2;
	}



}
