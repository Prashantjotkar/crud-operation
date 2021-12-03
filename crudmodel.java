package org.restapi.crud.crud.model;

public class crudmodel {
	private int studentNo;
	private String studentName;
	private int DOB;
	private int DOJ;

	public crudmodel() {

	}

	public crudmodel(int studentNo, String studentName, int DOB,int DOJ) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.DOB = DOB;
		this.DOJ=DOJ;
	}

	public long getstudentNo() {
		return studentNo;
	}

	public void setstudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getstudentName() {
		return studentName;
	}

	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getDOB() {
		return DOB;
	}

	public void setDOB(int DOB) {
		this.DOB = DOB;
	}
	public int getDOJ() {
		return DOJ;
	}

	public void setDOJ(int DOJ) {
		this.DOJ = DOJ;
	}



}
