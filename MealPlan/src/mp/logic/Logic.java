package mp.logic;

import java.sql.ResultSet;

import mp.persistence.DataFetch;

public class Logic {

	private DataFetch df;
	private ResultSet rs;
	public Logic(){
		df = new DataFetch();
	}
	
	public void newMealPlan(String Name){
		df.NewMealPlan(Name);
	}
	
	public void newCommuter(String Name){
		df.NewCommuter(Name);
	}
	
	
}
