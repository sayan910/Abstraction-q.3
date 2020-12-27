package com.app;
import java.util.Scanner;
import com.model.LifeInsurancePolicy;

public class Appmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the policy Id");
		int policyId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the policy Name");
		String policyName=sc.nextLine();
		System.out.println("Enter the customer Name");
		String customerName=sc.nextLine();
		System.out.println("Enter the Amount");
		float amount=sc.nextFloat();
		sc.nextLine();
		System.out.println("Enter the nominee Name");
		String nomineeName=sc.nextLine();
		System.out.println("Enter the number of years");
		int noOfYears=sc.nextInt();
		sc.nextLine();
		
		LifeInsurancePolicy lifeinsurancepolicy= new LifeInsurancePolicy(policyId, policyName,customerName,amount,nomineeName,noOfYears );
		System.out.println("Policy Id-"+lifeinsurancepolicy.getPolicyId());
		System.out.println("Policy Name-"+lifeinsurancepolicy.getPolicyName());
		System.out.println("Customer Name-"+lifeinsurancepolicy.getCustomerName());
		System.out.println("Amount-"+lifeinsurancepolicy.getAmount());
		System.out.println("Nominee Name-"+lifeinsurancepolicy.getNomineeName());
		System.out.println("Period-"+lifeinsurancepolicy.getNoOfYears());
		System.out.println("Bonus amount-"+lifeinsurancepolicy.calculateBonus());
		
		
		
		

	}

}
