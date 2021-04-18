package pl.dziedzic.empik.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.dziedzic.empik.model.github.GithubUser;

@Component
public class GithubClient {

	@Value("${url}")
	private String url;

	private RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());

	private HttpComponentsClientHttpRequestFactory getClientHttpRequestFactory() {
		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
		clientHttpRequestFactory.setConnectTimeout(10000);
		clientHttpRequestFactory.setReadTimeout(10000);
		return clientHttpRequestFactory;
	}

	public GithubUser getUserByLogin(String login) {
		return restTemplate.getForObject(url + login, GithubUser.class);
	}
}
