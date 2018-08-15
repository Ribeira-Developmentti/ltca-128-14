package modelo;

import java.io.Serializable;
import java.util.Arrays;

public class Matriz implements Serializable{

	private static final long serialVersionUID = 1L;

	private String[] palpites;

	public Matriz(String[] palpites) {
		super();
		this.palpites = palpites;
	}

	public Matriz() {
		super();
	}

	public String[] getPalpites() {
		return palpites;
	}

	public void setPalpites(String[] palpites) {
		this.palpites = palpites;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(palpites);
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
		Matriz other = (Matriz) obj;
		if (!Arrays.equals(palpites, other.palpites))
			return false;
		return true;
	}
	
	
	
}
