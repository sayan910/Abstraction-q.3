package com.model;

public class InsurancePolicy {
	protected int policyId;
	protected String policyName;
	protected String customerName;
	protected float amount;
	public InsurancePolicy(int policyId, String policyName, String customerName, float amount) {
		this.policyId = policyId;
		this.policyName = policyName;
		this.customerName = customerName;
		this.amount = amount;
	}
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float calculateBonus() {
		float Bonus= (8*amount)/100;
		return Bonus;
	}
	
	

}
