package com.apis.user.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="user_exam_score_table")
public class UserExamScore {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rowId;
	@NotNull
	private int userId;
	@NotNull
	private int examId;
	@NotNull
	private Date dateGiven;
	@NotNull
	private int status;
	public int getRowId() {
		return rowId;
	}
	public void setRowId(int rowId) {
		this.rowId = rowId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getExamId() {
		return examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public Date getDateGiven() {
		return dateGiven;
	}
	public void setDateGiven(Date dateGiven) {
		this.dateGiven = dateGiven;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public UserExamScore(int rowId, int userId, int examId, Date dateGiven, int status) {
		super();
		this.rowId = rowId;
		this.userId = userId;
		this.examId = examId;
		this.dateGiven = dateGiven;
		this.status = status;
	}
	public UserExamScore() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
