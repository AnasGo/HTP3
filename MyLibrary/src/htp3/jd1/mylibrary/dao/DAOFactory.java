package htp3.jd1.mylibrary.dao;

import htp3.jd1.mylibrary.dao.impl.SQLAdminDAO;
import htp3.jd1.mylibrary.dao.impl.SQLCommonDAO;
import htp3.jd1.mylibrary.dao.impl.SQLUserDAO;

public class DAOFactory {
	private static final DAOFactory factory = new DAOFactory();
	
	private final CommonDao commonDao = new SQLCommonDAO();
	private final UserDao userDao = new SQLUserDAO();
	private final AdminDao adminDao = new SQLAdminDAO();
	
	private DAOFactory(){
		
	}
	
	public static DAOFactory getInstance (){
		return factory;
	}
	
	public CommonDao getCommonDao(){
		return commonDao;
	}
	
	public UserDao getUserDao(){
		return userDao;
	}
	
	public AdminDao getAdminDao(){
		return adminDao;
	}
	
	

}
