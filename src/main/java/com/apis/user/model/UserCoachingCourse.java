package com.apis.user.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name="user_coaching_course_table")
public class UserCoachingCourse {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rowId;
	@NotNull
	private int userId;
	@NotNull
	private int coachingId;
	@NotNull
	private int courseId;
	@NotNull
	private Date dateSubscribed;
	@NotNull
	private int active;  // if its still accessible to the user
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
	public int getCoachingId() {
		return coachingId;
	}
	public void setCoachingId(int coachingId) {
		this.coachingId = coachingId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public Date getDateSubscribed() {
		return dateSubscribed;
	}
	public void setDateSubscribed(Date dateSubscribed) {
		this.dateSubscribed = dateSubscribed;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public UserCoachingCourse(int rowId, int userId, int coachingId, int courseId, Date dateSubscribed, int active) {
		super();
		this.rowId = rowId;
		this.userId = userId;
		this.coachingId = coachingId;
		this.courseId = courseId;
		this.dateSubscribed = dateSubscribed;
		this.active = active;
	}
	public UserCoachingCourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
