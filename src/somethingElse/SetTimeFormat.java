package somethingElse;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SetTimeFormat {
	public static void main(String[] args) {

		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

		System.out.println("當前時間為: " + ft.format(dNow));
		//自訂日期時間格式 HH24小時制 hh12小時制
	}

}
