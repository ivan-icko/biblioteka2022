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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (isbn ^ (isbn >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		if (isbn != other.isbn)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", isbn=" + isbn + ", autori=" + autori + ", izdavac=" + izdavac
				+ ", izdanje=" + izdanje + "]";
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
