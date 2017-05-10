package be.viaa.response;

import java.io.Serializable;

public class PIDIdResponse implements Serializable {
	
	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The generated ID to be used as PID
	 */
	private String id;
	
	/**
	 * Index of the generated ID
	 */
	private int number;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PIDIdResponse [id=" + id + ", number=" + number + "]";
	}

}
