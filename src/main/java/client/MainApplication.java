package client;
import java.sql.*;
import java.util.*;
import service.*;
import helper.*;
import model.*;
public class MainApplication {
	public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);
		do {
			System.out.println("*** Welcome ****");
			System.out.println("1 ->Admin Login");
			System.out.println("2 ->User Login");
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			sc.nextLine();
			switch(ch)
			{
			case 1:
				System.out.println(" Welcome Admin Page ");
				System.out.println("Enter Username");
				String username=sc.nextLine();
				System.out.println("Enter Password");
				String password=sc.nextLine();
				//model cha obj ani data model save kela
				AdminLogin al=new AdminLogin();
				al.setUsename(username);
				al.setPassword(password);

				//create service object 
				AdminService as=new AdminServiceImpl();
				//service cha obj ni apn tyachi method call krto ani tyala paramter
				//model class cha object
				boolean b=as.adminLogin(al);
				if(b==true)
				{
					System.out.println("Admin Login Successfully");
					//donhi correct asel tevha method call hoyl
					AdminHelper.startOperation();
				}
				else {
					System.out.println("Enter Valid Data...");

				}
				break;
			case 2:
				System.out.println(" Welcome Studnet ");
				break;
			}
			
		}while(true);
	}

}
