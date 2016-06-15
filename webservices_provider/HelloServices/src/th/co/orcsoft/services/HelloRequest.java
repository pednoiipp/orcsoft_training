package th.co.orcsoft.services;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class HelloRequest implements Serializable {

	private static final long serialVersionUID = -3792986084407409309L;

	/**
	 * nillable = true : value can't be null required = true : request xml must
	 * have this tag
	 */
	@XmlElement(name = "Name", nillable = false, required = true)
	private String name;

	/**
	 * nillable = true : value can't be null required = true : request xml must
	 * have this tag
	 */
	@XmlElement(name = "Surname", nillable = false, required = true)
	private String surname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
