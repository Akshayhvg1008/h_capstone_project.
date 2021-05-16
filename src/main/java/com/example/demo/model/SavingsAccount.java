

package com.example.demo.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "savings_acc")
public class SavingsAccount {
	
	
	@ManyToOne
	@JoinColumn(name = "primary_account_id")
	private PrimaryAccount primaryAccount;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long savings_account_id;
	
	@Column(name="balance")
	private int balance;
	
	public Long getPrimary_account_id() {
		return savings_account_id;
	}

	public void setPrimary_account_id(Long savings_account_id) {
		this.savings_account_id = savings_account_id;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Column(name="date")
     private String date;
     
     
     
}
