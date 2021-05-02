package com.jocata.A__JAXB.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="OfflinePaperlessKyc")
@XmlAccessorType(XmlAccessType.FIELD)
public class OfflinePaperlessKyc {
	
	@XmlAttribute(name="referenceId")
	private String referenceId;
	
	@XmlElement(name="UidData")
	private String uidData;
	
	public String getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

	public String getUidData() {
		return uidData;
	}

	public void setUidData(String uidData) {
		this.uidData = uidData;
	}


	
	

	
	
	
	
	

}
