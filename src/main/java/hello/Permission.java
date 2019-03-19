package hello;

public class Permission {
	
	private final long id;
	private final String description;
	
	public Permission(long id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}
	
}
