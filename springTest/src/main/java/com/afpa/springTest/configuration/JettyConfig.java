package com.afpa.springTest.configuration;

import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

/**
 * @author Lucas
 *Classe permettant de lancer l'application via un serveur Jetty
 */
public class JettyConfig {

	@Bean
	public ConfigurableServletWebServerFactory webServerFactory() {
		JettyServletWebServerFactory factory = new JettyServletWebServerFactory();
		factory.setPort(9009);
		factory.setContextPath("/app");
		factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "notfound.html"));
		return factory;
	}
}
