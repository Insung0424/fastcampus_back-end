package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert mysql"+userInfo.getUserId());		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update mysql"+userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete mysql"+userInfo.getUserId());
	}

}
