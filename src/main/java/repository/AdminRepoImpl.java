package repository;

import databaseConfigration.Dbconfig;
import model.AdminLogin;

public class AdminRepoImpl extends Dbconfig implements AdminRepo {

	@Override
	public boolean adminLogin(AdminLogin al) {
		try {
			
		ps=con.prepareStatement("select * from adminLogin where username=? and password=?");
		ps.setString(1,al.getUsename());
		ps.setString(2,al.getPassword());
		rs=ps.executeQuery();
		if(rs.next())
		{
			return true;
		}
		else {
			return false;
		}
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}

	}

}
