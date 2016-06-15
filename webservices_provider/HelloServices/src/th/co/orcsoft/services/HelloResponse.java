package th.co.orcsoft.services;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class HelloResponse implements Serializable {

	private static final long serialVersionUID = -4376115076156745139L;

	@XmlElement(name = "HelloResponseHeader")
	private HelloResponseHeader helloResponseHeader;
	@XmlElement(name = "HelloText")
	private String helloText;

	public HelloResponseHeader getHelloResponseHeader() {
		return helloResponseHeader;
	}

	public void setHelloResponseHeader(HelloResponseHeader helloResponseHeader) {
		this.helloResponseHeader = helloResponseHeader;
	}

	public String getHelloText() {
		return helloText;
	}

	public void setHelloText(String helloText) {
		this.helloText = helloText;
	}

}
