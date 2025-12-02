package service;

import model.AdminLogin;
import repository.AdminRepo;
import repository.AdminRepoImpl;

public class AdminServiceImpl implements AdminService {

	AdminRepo ar=new AdminRepoImpl();
	@Override
	public boolean adminLogin(AdminLogin al) {
		// TODO Auto-generated method stub
		   return ar.adminLogin(al);
	}

}
