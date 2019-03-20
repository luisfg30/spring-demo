package hello;

public class User {

	private final long id;
	private final String name;
	private final String birthday;
	
	public User(long id, String name, String birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getBirthday() {
		return birthday;
	}

	@Override
	public String toString() {
		return "User {id='" + id + "', name='" + name + "', birthday='" + birthday + "}";
	}
	
}
