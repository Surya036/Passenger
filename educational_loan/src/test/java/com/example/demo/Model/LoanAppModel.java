package com.example.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="loanApplicationmodel")
public class LoanAppModel {
	@Id
	private int LoanId;
	private String LoanType;
	private String applicantName;
	private String applicantAddress;
	private String applicantMobile;
	private String applicantEmail;
	private String applicantAadhaar;
	private String applicantPan;
	private String applicantSalary;
	private String loanAmountRequired;
	private String loanRepaymentMonths;
	private String Documentmodel;
	private int DocumentId;
	public int getLoanId() {
		return LoanId;
	}
	public void setLoanId(int loanId) {
		LoanId = loanId;
	}
	public String getLoanType() {
		return LoanType;
	}
	public void setLoanType(String loanType) {
		LoanType = loanType;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantAddress() {
		return applicantAddress;
	}
	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}
	public String getApplicantMobile() {
		return applicantMobile;
	}
	public void setApplicantMobile(String applicantMobile) {
		this.applicantMobile = applicantMobile;
	}
	public String getApplicantEmail() {
		return applicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	public String getApplicantAadhaar() {
		return applicantAadhaar;
	}
	public void setApplicantAadhaar(String applicantAadhaar) {
		this.applicantAadhaar = applicantAadhaar;
	}
	public String getApplicantPan() {
		return applicantPan;
	}
	public void setApplicantPan(String applicantPan) {
		this.applicantPan = applicantPan;
	}
	public String getApplicantSalary() {
		return applicantSalary;
	}
	public void setApplicantSalary(String applicantSalary) {
		this.applicantSalary = applicantSalary;
	}
	public String getLoanAmountRequired() {
		return loanAmountRequired;
	}
	public void setLoanAmountRequired(String loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}
	public String getLoanRepaymentMonths() {
		return loanRepaymentMonths;
	}
	public void setLoanRepaymentMonths(String loanRepaymentMonths) {
		this.loanRepaymentMonths = loanRepaymentMonths;
	}
	public String getDocumentmodel() {
		return Documentmodel;
	}
	public void setDocumentmodel(String documentmodel) {
		Documentmodel = documentmodel;
	}
	public int getDocumentId() {
		return DocumentId;
	}
	public void setDocumentId(int documentId) {
		DocumentId = documentId;
	}
	
	
}
