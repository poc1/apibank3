package com.dedhat.developers.model2;

public class CustomerContactPhoneDetail {
	
	private String customerId;
	private String phoneCategory;
	private String phoneSequence;
	private String cellPhoneCompany;
	private String phoneType;
	private String phoneContactType;
	private String phoneAreaCode;
	private String phoneNumber;
	private String phoneRegistrationDate;
	private String phoneUptateDate;
	private String relatedAddress;
	private String contactIndicator;
	private String contactDate;
	private String observations;
	private ExtensionNumbers extensionNumbers;
	
		
			
	public CustomerContactPhoneDetail() {}
	
	public CustomerContactPhoneDetail(String customerId, String phoneCategory, String phoneSequence,
			String cellPhoneCompany, String phoneType, String phoneContactType, String phoneAreaCode,
			String phoneNumber, String phoneRegistrationDate, String phoneUptateDate, String relatedAddress,
			String contactIndicator, String contactDate, String observations, ExtensionNumbers extensionNumbers) {
		super();
		this.customerId = customerId;
		this.phoneCategory = phoneCategory;
		this.phoneSequence = phoneSequence;
		this.cellPhoneCompany = cellPhoneCompany;
		this.phoneType = phoneType;
		this.phoneContactType = phoneContactType;
		this.phoneAreaCode = phoneAreaCode;
		this.phoneNumber = phoneNumber;
		this.phoneRegistrationDate = phoneRegistrationDate;
		this.phoneUptateDate = phoneUptateDate;
		this.relatedAddress = relatedAddress;
		this.contactIndicator = contactIndicator;
		this.contactDate = contactDate;
		this.observations = observations;
		this.extensionNumbers = extensionNumbers;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPhoneCategory() {
		return phoneCategory;
	}
	public void setPhoneCategory(String phoneCategory) {
		this.phoneCategory = phoneCategory;
	}
	public String getPhoneSequence() {
		return phoneSequence;
	}
	public void setPhoneSequence(String phoneSequence) {
		this.phoneSequence = phoneSequence;
	}
	public String getCellPhoneCompany() {
		return cellPhoneCompany;
	}
	public void setCellPhoneCompany(String cellPhoneCompany) {
		this.cellPhoneCompany = cellPhoneCompany;
	}
	public String getPhoneType() {
		return phoneType;
	}
	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	public String getPhoneContactType() {
		return phoneContactType;
	}
	public void setPhoneContactType(String phoneContactType) {
		this.phoneContactType = phoneContactType;
	}
	public String getPhoneAreaCode() {
		return phoneAreaCode;
	}
	public void setPhoneAreaCode(String phoneAreaCode) {
		this.phoneAreaCode = phoneAreaCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneRegistrationDate() {
		return phoneRegistrationDate;
	}
	public void setPhoneRegistrationDate(String phoneRegistrationDate) {
		this.phoneRegistrationDate = phoneRegistrationDate;
	}
	public String getPhoneUptateDate() {
		return phoneUptateDate;
	}
	public void setPhoneUptateDate(String phoneUptateDate) {
		this.phoneUptateDate = phoneUptateDate;
	}
	public String getRelatedAddress() {
		return relatedAddress;
	}
	public void setRelatedAddress(String relatedAddress) {
		this.relatedAddress = relatedAddress;
	}
	public String getContactIndicator() {
		return contactIndicator;
	}
	public void setContactIndicator(String contactIndicator) {
		this.contactIndicator = contactIndicator;
	}
	public String getContactDate() {
		return contactDate;
	}
	public void setContactDate(String contactDate) {
		this.contactDate = contactDate;
	}
	public String getObservations() {
		return observations;
	}
	public void setObservations(String observations) {
		this.observations = observations;
	}

	public ExtensionNumbers getExtensionNumbers() {
		return extensionNumbers;
	}

	public void setExtensionNumbers(ExtensionNumbers extensionNumbers) {
		this.extensionNumbers = extensionNumbers;
	}

}

