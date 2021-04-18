package pl.dziedzic.empik.dto;

import java.util.Date;

public class UserDto {

	private int id;

	private String login;

	private String name;

	private String type;

	private String avatarUrl;

	private Date createAt;

	private int calculations;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public int getCalculations() {
		return calculations;
	}

	public void setCalculations(int calculations) {
		this.calculations = calculations;
	}

}
