package biblioteka;

import java.util.List;

public class Knjiga {
	
	private String naslov;
	public String getNaslov() {
		return naslov;
	}
	public long getIsbn() {
		return isbn;
	}
	
	public List<Autor> getAutori() {
		return autori;
	}
	public void setAutori(List<Autor> autori) {
		this.autori = autori;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	private long isbn;
	private List<Autor> autori;
	private String izdavac;
	private int izdanje;
	

	
}
