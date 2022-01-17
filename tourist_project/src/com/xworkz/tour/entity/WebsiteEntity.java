package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="website_table")

public class WebsiteEntity implements Serializable {

	@Id
	@Column(name="web_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int webId;
	@Column(name="web_name")
	private String webName;
	@Column(name="web_url")
	private String webURL;
	@Column(name="since")
	private int since;
	@Column(name="domain")
	private String domain;
	@Column(name="owner")
	private String owner;
	
	public WebsiteEntity() {
		
	}

	public WebsiteEntity(String webName, String webURL, int since, String domain, String owner) {
		super();
		
		this.webName = webName;
		this.webURL = webURL;
		this.since = since;
		this.domain = domain;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "WebsiteEntity [webId=" + webId + ", webName=" + webName + ", webURL=" + webURL + ", since=" + since
				+ ", domain=" + domain + ", owner=" + owner + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + webId;
		result = prime * result + ((webName == null) ? 0 : webName.hashCode());
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
		WebsiteEntity other = (WebsiteEntity) obj;
		if (webId != other.webId)
			return false;
		if (webName == null) {
			if (other.webName != null)
				return false;
		} else if (!webName.equals(other.webName))
			return false;
		return true;
	}

	public int getWebId() {
		return webId;
	}

	public void setWebId(int webId) {
		this.webId = webId;
	}

	public String getWebName() {
		return webName;
	}

	public void setWebName(String webName) {
		this.webName = webName;
	}

	public String getWebURL() {
		return webURL;
	}

	public void setWebURL(String webURL) {
		this.webURL = webURL;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
	
}
