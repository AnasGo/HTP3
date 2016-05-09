package htp3.jd1.mylibrary.dao.impl;

import htp3.jd1.mylibrary.dao.CommonDao;

public class SQLCommonDAO implements CommonDao {

	@Override
	public boolean authorization(String login, String password) {
	
		return true;
	}

}
