package lottomaxrecord;

import java.util.ArrayList;

public class TimeRecord implements maxRecord{
	private ArrayList<Integer> nlist = new ArrayList<>();
	private String count;
	private String select = "";
	private TimeRecord() {}
	
	public TimeRecord(String count) {
		this.count = count;
	}

	@Override
	public String SelectQuery(String count) {
		switch (count) {
		case "전체기간" :
			select = "select * from admin.copy_lotto_table_count_number_ASC";
			break;
		case "최근 한달" :
			select = "select * from admin.copy_lotto_table_count_number_ASC_MONTH1";
			break;
		case "최근 3개월" :
			select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_MONTH3";
			break;
		case "최근 6개월" :
			select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_MONTH6";
			break;
		case "최근 1년" :
			select = "select * from admin.COPY_LOTTO_TABLE_COUNT_NUMBER_ASC_YEAR1";
			break;
		}
		return select;
	}

	

	
	
	
	

}
