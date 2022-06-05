package ch13.web.userInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoclient {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties(); // 쌍으로 읽는게 가능한 객체
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userinfo = new UserInfo();
		userinfo.setUserId("13456");
		userinfo.setPasswrod("@#$^");
		userinfo.setUserName("LEE");
		UserInfoDao userinfodao = null;
		
		if(dbType.equals("ORACLE")) {
			userinfodao = new UserInfoOracleDao();
		}
		else if (dbType.equals("MYSQL")) {
			userinfodao = new UserInfoMySqlDao();
		}
		else {
			System.out.println("db error");
			return;
		}
		
		
		userinfodao.insertUserInfo(userinfo);
		userinfodao.updateUserInfo(userinfo);
		userinfodao.deleteUserInfo(userinfo);
		
	}

}
