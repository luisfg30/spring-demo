package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
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

	@Override
	public String toString() {
		return "Permission{" +
				"id='" + id + '\'' +
				", description=" + description + 
				'}';
	}
	

}
