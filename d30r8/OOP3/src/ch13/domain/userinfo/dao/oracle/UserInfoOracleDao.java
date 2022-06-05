package ch13.domain.userinfo.dao.oracle;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("insert Oracle"+userInfo.getUserId());		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update Oracle"+userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete Oracle"+userInfo.getUserId());
	}

}
