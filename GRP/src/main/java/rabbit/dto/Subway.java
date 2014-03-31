package rabbit.dto;

public class Subway {
	private int subwayCode;
	private String subwayName;
	private int subwayLength;
	private int subwayPrice;
	
	public Subway() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subway(int subwayCode, String subwayName, int subwayLength,
			int subwayPrice) {
		super();
		this.subwayCode = subwayCode;
		this.subwayName = subwayName;
		this.subwayLength = subwayLength;
		this.subwayPrice = subwayPrice;
	}
	public Subway(int subwayCode, String subwayName) {
		super();
		this.subwayCode = subwayCode;
		this.subwayName = subwayName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Subway [subwayCode=");
		builder.append(subwayCode);
		builder.append(", subwayName=");
		builder.append(subwayName);
		builder.append(", subwayLength=");
		builder.append(subwayLength);
		builder.append(", subwayPrice=");
		builder.append(subwayPrice);
		builder.append("]");
		return builder.toString();
	}
	public int getSubwayCode() {
		return subwayCode;
	}
	public void setSubwayCode(int subwayCode) {
		this.subwayCode = subwayCode;
	}
	public String getSubwayName() {
		return subwayName;
	}
	public void setSubwayName(String subwayName) {
		this.subwayName = subwayName;
	}
	public int getSubwayLength() {
		return subwayLength;
	}
	public void setSubwayLength(int subwayLength) {
		this.subwayLength = subwayLength;
	}
	public int getSubwayPrice() {
		return subwayPrice;
	}
	public void setSubwayPrice(int subwayPrice) {
		this.subwayPrice = subwayPrice;
	}
	
	
}
