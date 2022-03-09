package Room;

public class Room {
	// 房间 类型
	private String type;
	// 房间号
	private String num;
	// 状态
	private boolean isUse;
	
	
	public Room(String type, String num, boolean isUse) {
		super();
		this.type = type;
		this.num = num;
		this.isUse = isUse;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the num
	 */
	public String getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(String num) {
		this.num = num;
	}
	/**
	 * @return the isUse
	 */
	public boolean isUse() {
		return isUse;
	}
	/**
	 * @param isUse the isUse to set
	 */
	public void setUse(boolean isUse) {
		this.isUse = isUse;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Room [type=" + type + ", num=" + num + ", isUse=" + isUse + "]";
	}
	
	
	
}
