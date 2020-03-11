package ykb.com.ykb.java.train.exceptions;

public class MyRuntimeException extends RuntimeException {
	private static final long serialVersionUID = 1497356554521937312L;

	private String mesaj;

	public MyRuntimeException(String mesaj) {
		super();
		this.setMesaj(mesaj);
	}

	public String getMesaj() {
		return mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

}
