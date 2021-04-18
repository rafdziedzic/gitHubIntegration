package pl.dziedzic.empik.model;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calculation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "LOGIN")
	private String login;

	@Column(name = "REQUEST_COUNT")
	private int requestCount;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getRequestCount() {
		return requestCount;
	}

	public void setRequestCount(int requestCount) {
		this.requestCount = requestCount;
	}

	@Override
	public String toString() {
		return "Calculation{" + "login='" + login + '\'' + ", requestCount=" + requestCount + '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		final Calculation that = (Calculation) o;
		return requestCount == that.requestCount && Objects.equals(login, that.login);
	}

	@Override
	public int hashCode() {
		return Objects.hash(login, requestCount);
	}

}
