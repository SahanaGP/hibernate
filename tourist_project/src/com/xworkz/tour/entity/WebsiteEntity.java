package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="website_table")

@NamedQueries({
	@NamedQuery(name="getByNameGoogle",query="select wEntity from WebsiteEntity as wEntity where wEntity.webName='Google'"),
	@NamedQuery(name="getByLikeURL",query="select web from WebsiteEntity as web where web.webURL like 'www.voo%'"),
	@NamedQuery(name="getByMinSince",query="select minSince from WebsiteEntity as minSince where minSince.webSince="+ "(select min(we.webSince) from WebsiteEntity we)" ),
	@NamedQuery(name="getByMaxSince",query="select maxSince from WebsiteEntity as maxSince where maxSince.webSince="+ "(select max(wen.webSince) from WebsiteEntity wen)"),
	@NamedQuery(name="getBySecondMaxSince",query="select secondMax from WebsiteEntity as secondMax where secondMax.webSince="+
	"(select max(web.webSince) from WebsiteEntity as web where web.webSince<" +
			"(select max(maximum.webSince) from WebsiteEntity as maximum))"),
	@NamedQuery(name="getBySecondMinSince",query="select second from WebsiteEntity as second where second.webSince="+
			"(select min(web.webSince) from WebsiteEntity as web where web.webSince>" +
			"(select min(minimum.webSince) from WebsiteEntity as minimum))")

})

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
	private int webSince;
	@Column(name="domain")
	private String webDomain;
	@Column(name="owner")
	private String webOwner;
	
	public WebsiteEntity() {
		
	}

	public WebsiteEntity(String webName, String webURL, int since, String domain, String owner) {
		super();
		
		this.webName = webName;
		this.webURL = webURL;
		this.webSince = since;
		this.webDomain = domain;
		this.webOwner = owner;
	}

	@Override
	public String toString() {
		return "WebsiteEntity [webId=" + webId + ", webName=" + webName + ", webURL=" + webURL + ", since=" + webSince
				+ ", domain=" + webName + ", owner=" + webOwner + "]";
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
		return webSince;
	}

	public void setSince(int since) {
		this.webSince = since;
	}

	public String getDomain() {
		return webName;
	}

	public void setDomain(String domain) {
		this.webName = domain;
	}

	public String getOwner() {
		return webOwner;
	}

	public void setOwner(String owner) {
		this.webOwner = owner;
	}
	
	
	
}
