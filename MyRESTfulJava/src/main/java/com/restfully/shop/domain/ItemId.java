package com.restfully.shop.domain;

// default package
// Generated May 6, 2013 4:39:46 PM by Hibernate Tools 3.4.0.CR1

/**
 * ItemId generated by hbm2java
 */
public class ItemId implements java.io.Serializable {

	private int invoiceid;
	private int item;

	public ItemId() {
	}

	public ItemId(int invoiceid, int item) {
		this.invoiceid = invoiceid;
		this.item = item;
	}

	public int getInvoiceid() {
		return this.invoiceid;
	}

	public void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
	}

	public int getItem() {
		return this.item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ItemId))
			return false;
		ItemId castOther = (ItemId) other;

		return (this.getInvoiceid() == castOther.getInvoiceid())
				&& (this.getItem() == castOther.getItem());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getInvoiceid();
		result = 37 * result + this.getItem();
		return result;
	}

}
