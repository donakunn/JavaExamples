package traccia150615RunHashMap;

import java.io.Serializable;

class Voto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int punteggio;
	
	Voto(int v) {
		this.punteggio = v;
	}
	
	void SetPunteggio(int v) {
		this.punteggio = v;
	}
	
	int getPunteggio() {
		return this.punteggio;
	}
	
	public String toString() {
		return String.valueOf(this.punteggio);
	}
	public boolean equals (Object o) {
		return ((Voto)o).getPunteggio() == this.punteggio;
	}

}
