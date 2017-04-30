package mp.persistence;

import java.sql.Connection;
import java.sql.ResultSet;

public class DataFetch {

	DatabaseAccess db;
	Connection con;
	
	public DataFetch(){
		db = new DatabaseAccess();
		con = db.connect();
	}
	
	
	public void NewMealPlan (String Name){
		String query = "INSERT INTO student (Name,Type) VALUES ('" + Name + "','MealPlan'); +"
				+ "INSERT INTO meal_plan(ID) VALUES ((Select StudentID from student where Name = '" + Name + "'))";
		
		db.update(con, query);
	}
	
	public void NewCommuter (String Name){
		String query = "INSERT INTO student (Name,Type) VALUES ('" + Name + "','Commuter')";
		db.update(con, query);
	}
	
	public ResultSet getUserTypeById(String ID){
		String query = "Select UserType from student where StudentID = " + ID;
		return db.retrieve(con, query);
	}
	
	public ResultSet getMealPlanUserByID(String ID){
		String query = "Select * from student s, meal_plan m where s.StudentID = m.StudentID and s.Student ID =" + ID;
		return db.retrieve(con, query);
	}
	
	public ResultSet getCommuterByUserID(String ID){
		String query = "Select * from student s, commuter c where s.StudentID = c.StudentID and s.Student ID =" + ID;
		return db.retrieve(con, query);
	}
	
	
}
