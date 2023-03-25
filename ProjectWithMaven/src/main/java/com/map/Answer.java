package com.map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int answerId;
	private String answer;
	@OneToOne
	private Question q;
	public Question getQ() {
		return q;
	}
	public void setQ(Question q) {
		this.q = q;
	}
	public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

}
