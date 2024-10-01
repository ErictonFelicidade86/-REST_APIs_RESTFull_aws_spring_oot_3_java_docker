package br.am.ericton;

public class Greeting {
	
	private final long id;
	private final String contnet;
	
	public Greeting(long id, String contnet) {
		super();
		this.id = id;
		this.contnet = contnet;
	}

	public long getId() {
		return id;
	}

	public String getContnet() {
		return contnet;
	}

}
