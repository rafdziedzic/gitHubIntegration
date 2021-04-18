package pl.dziedzic.empik.model;

import java.util.Date;
import java.util.Objects;

public class User {

	private int id;

	private String login;

	private String name;

	private String type;

	private String avatarUrl;

	private Date createAt;

	private int calculations;

	public User() {
	}

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

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", login='" + login + '\'' + ", name='" + name + '\'' + ", type='" + type + '\'' + ", avatarUrl='"
				+ avatarUrl + '\'' + ", createAt=" + createAt + ", calculations=" + calculations + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		final User user = (User) o;
		return id == user.id && calculations == user.calculations && Objects.equals(login, user.login) && Objects.equals(name, user.name)
				&& Objects.equals(type, user.type) && Objects.equals(avatarUrl, user.avatarUrl) && Objects.equals(createAt, user.createAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, login, name, type, avatarUrl, createAt, calculations);
	}

}
