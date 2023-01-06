package com.training.jsf.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="data")
@SessionScoped

public class ConsumerData {
	
	private String meterID;
	private int currMeterReading;
	private int prevMeterReading;
	private String zone;
	
	private List<Consumer> conslist = new ArrayList<>();
			
	
	public List<Consumer> getConsumer(){
		
		if(conslist.size()==0) {
		 Connection con = null;
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		 
	      
	        String url = "jdbc:mysql://localhost:3306/infinite";
	        String user = "root";
	        String pass = "India123";
	        con = DriverManager.getConnection(url,user,pass);
	        Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("select * from consumer");
	        while(rs.next()) {
	        	conslist.add(new Consumer(rs.getString(1), rs.getInt(2),rs.getInt(3),rs.getString(4)));
	          
	        	
	        } 
	       

		}
		 
        catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	finally {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
		
		return conslist;
		}
		else {
			return conslist;
		}
	}
	
	public void addConsumer() {
		conslist.add(new Consumer (meterID, currMeterReading, prevMeterReading, zone));
	}


	public String getMeterID() {
		return meterID;
	}


	public void setMeterID(String meterID) {
		this.meterID = meterID;
	}


	public int getCurrMeterReading() {
		return currMeterReading;
	}


	public void setCurrMeterReading(int currMeterReading) {
		this.currMeterReading = currMeterReading;
	}


	public int getPrevMeterReading() {
		return prevMeterReading;
	}


	public void setPrevMeterReading(int prevMeterReading) {
		this.prevMeterReading = prevMeterReading;
	}


	public String getZone() {
		return zone;
	}


	public void setZone(String zone) {
		this.zone = zone;
	}


	public List<Consumer> getConslist() {
		return conslist;
	}


	public void setConslist(List<Consumer> conslist) {
		this.conslist = conslist;
	}
	
}