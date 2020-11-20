package traccia150615RunHashMap;

import java.io.Serializable;

public class Esame implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String nomeEsame;
	
	Esame(String esame) {
		this.nomeEsame = esame;
	}
	
	void setNomeEsame(String esame) {
		this.nomeEsame = esame;
	}

	String getnomeEsame() {
		return this.nomeEsame;
	}
	
	public int hashCode() {
		return this.nomeEsame.hashCode();
	}
	
	public boolean equals (Object o) {
		return ((Esame)o).getnomeEsame() == this.nomeEsame;
	}
	public String toString() {
		return this.nomeEsame;
	}
}
