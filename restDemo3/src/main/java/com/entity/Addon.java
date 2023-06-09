package com.entity;
// Generated 22 Sep, 2022 6:01:12 PM by Hibernate Tools 3.2.2.GA


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Addon generated by hbm2java
 */
@Entity
public class Addon implements java.io.Serializable {

	private int addonid;
	private String addonname;
	private int addondailyrate;

	public Addon() {
	}

	public Addon(int addonid, String addonname, int addondailyrate) {
		this.addonid = addonid;
		this.addonname = addonname;
		this.addondailyrate = addondailyrate;
	}

	@Id

	public int getAddonid() {
		return this.addonid;
	}

	public void setAddonid(int addonid) {
		this.addonid = addonid;
	}

	public String getAddonname() {
		return this.addonname;
	}

	public void setAddonname(String addonname) {
		this.addonname = addonname;
	}

	@Override
	public String toString() {
		return "Addon [addonid=" + addonid + ", addonname=" + addonname + ", addondailyrate=" + addondailyrate + "]";
	}

	public int getAddondailyrate() {
		return this.addondailyrate;
	}

	public void setAddondailyrate(int addondailyrate) {
		this.addondailyrate = addondailyrate;
	}

}
