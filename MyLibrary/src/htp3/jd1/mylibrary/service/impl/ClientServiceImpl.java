package htp3.jd1.mylibrary.service.impl;

import htp3.jd1.mylibrary.dao.CommonDao;
import htp3.jd1.mylibrary.dao.DAOFactory;
import htp3.jd1.mylibrary.service.ClientService;

public class ClientServiceImpl implements ClientService {

	@Override
	public boolean logination(String login, String password) {
		if (login == null || login.isEmpty()) {
			return false;
		}

		DAOFactory factory = DAOFactory.getInstance();
		CommonDao commonDao = factory.getCommonDao();

		boolean result = commonDao.authorization(login, password);

		return result;
	}
}
