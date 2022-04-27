package com.rakuten;

public class PensionerDetail {
	
	private boolean valid = true;
	
	public boolean isValid() {
		return valid;
	}

	public PensionerDetail() {
		super();
	}

	public PensionerDetail(String name, String panNumber, String aadharNumber, int salaryEarned, int allowancesAmount, String pensionType,
			String bankType) {
		super();
		this.name = name;
		this.pensionType = pensionType;
		this.bankType = bankType;
		this.panNumber = panNumber;
		this.aadharNumber = aadharNumber;
		this.salaryEarned = salaryEarned;
		this.allowancesAmount = allowancesAmount;
		
	}

	public PensionerDetail(boolean valid) {
		super();
		this.valid = valid;
	}

	private String name;
	private String pensionType;
	private String bankType;
	private String panNumber;
	private String aadharNumber;
	private int allowancesAmount;
	private int salaryEarned;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPensionType() {
		return pensionType;
	}

	public void setPensionType(String pensionType) {
		this.pensionType = pensionType;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public int getAllowancesAmount() {
		return allowancesAmount;
	}

	public void setAllowancesAmount(int allowancesAmount) {
		this.allowancesAmount = allowancesAmount;
	}

	public int getSalaryEarned() {
		return salaryEarned;
	}

	public void setSalaryEarned(int salaryEarned) {
		this.salaryEarned = salaryEarned;
	}

	@Override
	public String toString() {
		return "PensionerDetail [name=" + name + ", salaryEarned=" + salaryEarned + "]";
	}
}

