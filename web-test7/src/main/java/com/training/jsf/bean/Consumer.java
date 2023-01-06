package com.training.jsf.bean;

public class Consumer {
	
	private String meterID;
	private int currMeterReading;
	private int prevMeterReading;
	private String zone;
	
	public Consumer(String meterID, int currMeterReading, int prevMeterReading, String zone) {
		super();
		this.meterID = meterID;
		this.currMeterReading = currMeterReading;
		this.prevMeterReading = prevMeterReading;
		this.zone = zone;
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
	
}
