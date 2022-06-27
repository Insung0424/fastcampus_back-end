package lottomaxrecord;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import UI.LottoLogin;

public class TimeRecord implements maxRecord{
	private ArrayList<Integer> nlist = new ArrayList<>();
	private String count;
	private String select = "";
	
	private TimeRecord() {}
	
	public TimeRecord(String count) {
		this.count = count;
	}

	@Override
	public void countRecord() {
		try {
			Connection conn = LottoLogin.getConnection();
			Statement stmt = conn.createStatement();
			
			select = SelectQuery(count);
			ResultSet rset = stmt.executeQuery(select);
			
			while(rset.next()) {
				int i=rset.getInt(1);
				nlist.add(i);
				int j=rset.getInt(2);
				System.out.println("숫자 "+ i+"의 "+count+"동안 나온 횟수 "+ j);
			}
			
			NoneNum Nn = new NoneNum(nlist);
			
			if(Nn.getNoneNum().length() > 2) {
				System.out.println("목록에 없는 숫자" +
						Nn.getNoneNum() + "은(는) "+ count +"동안 나오지 않았습니다");
			}
			
		}catch(Exception er) {
			er.printStackTrace();
		}
	}

	@Override
	public String SelectQuery(String count) {
		switch (count) {
		case "전체기간" :
			select = "select * from copy_lotto_table_count_number_ASC";
			break;
		case "최근 한달" :
			select = "select * from copy_lotto_table_count_number_ASC_MONTH1";
			break;
		case "최근 3개월" :
			select = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_MONTH3";
			break;
		case "최근 6개월" :
			select = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_MONTH6";
			break;
		case "최근 1년" :
			select = "select * from COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_YEAR1";
			break;
		}
		return select;
	}
	
	
	

}
