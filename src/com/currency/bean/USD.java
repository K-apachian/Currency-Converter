package com.currency.bean;

public class USD {
	private float usdQty;

	public float getUsdQty() {
		return usdQty;
	}

	public void setUsdQty(float usdQty) {
		this.usdQty = usdQty;
	}

	public USD(float usdQty) {
		super();
		this.usdQty = usdQty;
	}

	public USD() {
		super();
	}
}
