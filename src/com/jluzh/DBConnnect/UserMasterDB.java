package com.jluzh.DBConnnect;

import com.jluzh.Dao.UserMaster;

public interface UserMasterDB {

	
	public UserMaster findByUserMasterId(String id);
}
