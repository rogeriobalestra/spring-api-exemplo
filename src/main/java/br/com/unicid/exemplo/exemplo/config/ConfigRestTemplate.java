package br.com.unicid.exemplo.exemplo.config;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Essa classe é injetada para o RestTemple trafegar informações fora de conexão
 * segura https, pois os Pods locais de dev não usa SSL entre si.
 * 
 * @author rbignacio
 *
 */

@Configuration
public class ConfigRestTemplate {

	@Bean
	public RestTemplate restTemplate() {
		HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session) {
				return true;
			}
		});
		return new RestTemplate();
	}
}
