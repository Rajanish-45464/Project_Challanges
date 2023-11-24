package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import CRUD.DeleteData;
import CRUD.InsertData;
import CRUD.ShowData;
import CRUD.Update;

public class Strat {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException {
		
		System.out.println("Welcome to the Crud Operation");
		
		System.out.println("Enter your choice");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		while(true)
		{
			System.out.println("press 1 for inser data");
			System.out.println("press 2 for delete data");
			System.out.println("press 3 for update data");
			System.out.println("press 4 for show data");
			System.out.println("press 5 for exit");
			
			
			int i=Integer.parseInt(br.readLine());
			
			if(i==1)
			{
				//insert data
				System.out.println("Enter student name : ");
				String name=br.readLine();
				System.out.println("Enter student id : ");
				int id=Integer.parseInt(br.readLine());
				System.out.println("Enter student address : ");
				String address=br.readLine();
				
				StudentDetails sd=new StudentDetails(name,id,address);
				
			    boolean b=InsertData.insert(sd);
				if(b==true)
					System.out.println("Data iserted successfully");
				else
					System.out.println("Data not inserted ... sorry");
					
				
			}
			else if(i==2)
			{
				//delete data
				System.out.println("Enter id  no to delete data");
				StudentDetails sd=new StudentDetails();
				sd.setId(Integer.parseInt(br.readLine()));
				boolean b=DeleteData.delete(sd);
				if(b==true)
					System.out.println("Data deleted successfully");
				else
					System.out.println("Data not deleted ... sorry");
				
			}
			else if(i==3)
			{
				//update data
				System.out.println("Enter student name : ");
				String name=br.readLine();
				System.out.println("Enter student id : ");
				int id=Integer.parseInt(br.readLine());
				System.out.println("Enter student address : ");
				String address=br.readLine();
				
				StudentDetails sd=new StudentDetails(name,id,address);
				boolean b=Update.update(sd);
				if(b==true)
					System.out.println("updated successfully");
				else
					System.out.println("Not updated ... sorry");
				
			}
			else if(i==4)
			{
				//show data
				ShowData.showData();
				
			}
			else if(i==5)
			{
				//show data
				break;
			}
			else
			{
				System.out.println("Something went worng... please choose vailid choice");
			}
		}
		System.out.println("Succefully done... thanks to use this application");		
	}
}
