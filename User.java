package com.portfolioproject.model;

import java.util.*;

public class User
{
	private String userid;
	private String name;
	private String email;
	private List<Holding> holdings;

	public User(String userid, String name, String email)
	{
		this.userid=userid;
		this.name=name;
		this.email=email;
		this.holdings=new ArrayList<>();
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void addHolding(Holding stockHolding) {
		holdings.add(stockHolding);
	}

	public void display() {
		for (Holding holding : holdings) {
			System.out.println(holding);
		}
	}

	public List<Holding> getHoldings() {
		return holdings;
	}
}