package com.model;

public class LifeInsurancePolicy extends InsurancePolicy{
	private String nomineeName;
	private int noOfYears;
	public LifeInsurancePolicy(int policyId, String policyName, String customerName, float amount, String nomineeName, int noOfYears) {
		super(policyId, policyName, customerName, amount);
		// TODO Auto-generated constructor stub
		this.nomineeName=nomineeName;
		this.noOfYears=noOfYears;
		
	}
	public String getNomineeName() {
		return nomineeName;
	}
	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}
	public int getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	}
	@Override
	public float calculateBonus() {
		// TODO Auto-generated method stub
		float Bonus=(15*super.getAmount()/100);
		return Bonus;
	}
	
	
	
	
	

}
