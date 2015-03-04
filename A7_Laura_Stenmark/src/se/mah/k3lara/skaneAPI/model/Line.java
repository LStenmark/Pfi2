package se.mah.k3lara.skaneAPI.model;

import java.util.Calendar;

public class Line {
	private String name;
	private String line;
	private Calendar depTime;
	private String isTimingPoint;
	private String StopPoint;
	private String LineTypeId;
	private String LineTypeName;
	private String Towards;
	private String depTimeDeviation;
	private String depDeviationAffect;
	private String TrainNo;
	private String RumNo;
	
	
	
	public Line() {
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
		this.line = line;
	}
	public Calendar getDepTime() {
		return depTime;
	}
	
	public String getIsTimingPoint() {
		return isTimingPoint;
	}
	
	public void setIsTimingPoint(String isTimingPoint) {
		this.isTimingPoint = isTimingPoint;
	}
	
	public void setDepTime(Calendar depTime) {
		this.depTime = depTime;
	}
	public String getDepTimeDeviation() {
		return depTimeDeviation;
	}
	public void setDepTimeDeviation(String depTimeDeviation) {
		this.depTimeDeviation = depTimeDeviation;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getStopPoint() {
		return StopPoint;
	}
	
	public void setStopPoint(String StopPoint) {
		this.StopPoint = StopPoint;
	}
	
	public String getLineTypeId() {
		return LineTypeId;
	}
	
	public void setLineTypeId(String LineTypeId) {
		this.LineTypeId = LineTypeId;
	}
	
	public String getLineTypeName() {
		return LineTypeName;
	}
	
	public void setLineTypeName(String LineTypeName) {
		this.LineTypeName = LineTypeName;
	}
	
	public String getTowards() {
		return Towards;
	}
	
	public void setTowards(String Towards) {
		this.Towards = Towards;
	}
	
	public String getDepDeviationAffect() {
		return depDeviationAffect;
	}
	
	public void setDepDeviationAffect(String depDeviationAffect) {
		this.depDeviationAffect = depDeviationAffect;
	}
	
	public String getTrainNo() {
		return TrainNo;
	}
	
	public void setTrainNo(String TrainNo) {
		this.TrainNo = TrainNo;
	}
	
	public String getRumNo() {
		return RumNo;
	}
	
	public void setRumNo(String RumNo) {
		this.RumNo = RumNo;
	}	
}
