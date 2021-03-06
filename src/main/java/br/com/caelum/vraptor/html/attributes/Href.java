package br.com.caelum.vraptor.html.attributes;

import static br.com.caelum.vraptor.html.UrlFactory.url;
import br.com.caelum.vraptor.html.Url;

public class Href implements Attribute {
	private final Url value;

	public Href(Url value) {
		this.value = value;
	}

	public Href(String value) {
		this.value = url(value);
	}

	public String getValue() {
		return value.value();
	}
}
