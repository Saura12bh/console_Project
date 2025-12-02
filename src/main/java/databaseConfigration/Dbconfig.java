package databaseConfigration;
import java.sql.*;
import java.io.*;
import java.util.*;
public class Dbconfig {
	//jr ha class extends tr yachya sobt kahi aplya regular je object lagtay like prepared statment
	//  result set connection obj tr te yethech tyar krayche ani te protected krayche 
	//kran protected child madhe allow astya
	
	protected  Connection con;
	protected PreparedStatement ps;
	protected ResultSet rs;
	
	//ya public ya sathi bnvla jevha ha class apn dusya class madhe extends krnar tevdh ha con
	//automatic call zala pahije jevdhe repo madhe class bnvtil tyana ha extends krnar ahe
	public Dbconfig()
	{
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\CoreJavaConsoleProject\\src\\main\\resources\\databasecConn.properties");
			Properties p=new Properties();
			p.load(f);
			String dr=p.getProperty("driver");
			String ur=p.getProperty("url");
			String un=p.getProperty("user");
			String up=p.getProperty("pass");
			
			Class.forName(dr);
			 con=DriverManager.getConnection(ur,un,up);
		}
		catch(Exception e)
		{
		System.out.println(e);
	
		}
		
	}

}
