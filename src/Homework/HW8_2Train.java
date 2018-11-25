package Homework;

public class HW8_2Train implements Comparable<HW8_2Train> {
	// 如果物件要做比對大小順序時，必須要實作Comparable
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public HW8_2Train() {
	}

//	public HW8_2Train(int number, String type, String start, String dest, double price) {
//		this.number = number;
//		this.type = type;	
//		this.start = start;
//		this.dest = dest;
//		this.price = price;
//	}

	public void setter(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public String getStart() {
		return start;
	}

	public String getDest() {
		return dest;
	}

	public double getPrice() {
		return price;
	}

	@Override // 物件的比對方式hashCode是模糊比對，如果沒有改寫，會沿用Object類別的比對方式
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override // 物件都有顯示的方式，都來自於Object父類別
	public String toString() {
		return "<班次>" + number + "  " + "<車種>" + type + "  " + "<出發地>" + start + "  " + "<目的地>" + dest + "  " + "<票價>"
				+ price;
	}

	@Override // equals是精準比對，改寫物件比對的條件，如果沒有改寫，會沿用Object類別的比對方式
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		HW8_2Train other = (HW8_2Train) obj;
		if (number != other.number) {
			return false;
		}
		return true;
	}

	@Override // 必須要有實作comparable
	public int compareTo(HW8_2Train o) throws ClassCastException {
		if (this.number > o.number) {
			return 1;// 升冪排序
		} else if (this.number < o.number) {
			return -1;// 降冪排序
		} else {
			return 0;
		}
	}

}
