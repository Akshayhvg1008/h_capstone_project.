package com.example.demo.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "primary_acc")
public class PrimaryAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long primary_account_id;
	
	@Column(name="balance")
	private int balance;
	
	public Long getPrimary_account_id() {
		return primary_account_id;
	}

	public void setPrimary_account_id(Long primary_account_id) {
		this.primary_account_id = primary_account_id;
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
