package com.CMS.daoImpl;

import java.lang.reflect.InvocationTargetException;
import com.CMS.dao.MasterDao;

public class DaoFactory {
	
	private static MasterDao masterDao = null;
	public static MasterDao getDao(MasterDao dao) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException{
		if(masterDao!=null){
			return masterDao;
		}
		masterDao = dao;
		return masterDao;
	}
}
