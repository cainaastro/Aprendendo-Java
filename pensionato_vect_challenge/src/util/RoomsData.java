package util;

public class RoomsData {
	
	private String name;
	private String email;
	private int idRoom;
	
	public RoomsData(String name, String email, int idRoom) {
		super();
		this.name = name;
		this.email = email;
		this.idRoom = idRoom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdRoom() {
		return idRoom;
	}
	public void setIdRoom(int idRoom) {
		this.idRoom = idRoom;
	}
	
	
	
	
	
}
