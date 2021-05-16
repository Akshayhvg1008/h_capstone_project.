package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "withdraw")
public class Withdraw {
	@ManyToOne
	@JoinColumn(name = "primary_account_id")
	private PrimaryAccount primaryAccount;
	@Column(name="id")
	private Long id;
	public PrimaryAccount getPrimaryAccount() {
		return primaryAccount;
	}
	public void setPrimaryAccount(PrimaryAccount primaryAccount) {
		this.primaryAccount = primaryAccount;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Column(name="amount")
	private int amount;
	
}
