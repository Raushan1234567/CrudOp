package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dto.Author2;

import jaaftercom.excep.Somethingwent;

public class Imple implements Interface{

	@Override
	public void add(Author2 a) throws Somethingwent {
		// TODO Auto-generated method stub
		Connection c=null;
		
		try {
			c=Connection23.getco();
			
			String q="create table if not exists author23(id int primary key,name varchar(20),dob date not null)";
			
			
			PreparedStatement p=c.prepareStatement(q);
			p.executeUpdate();
			
			
			String Qw="Insert into author23 values(?,?,?)";
			
			PreparedStatement ps=c.prepareStatement(Qw);
			
			ps.setString(1, a.getId());
			ps.setString(2, a.getName());
			ps.setDate(3, Date.valueOf(a.getDob()));
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			throw new  Somethingwent("Not addedd");
		}
		
		
	}

	@Override
	public void Update(Author2 a) throws Somethingwent {
Connection c=null;
		
		try {
			c=Connection23.getco();
			
			String q="update author23 set name=?,dob=?  where id=?";
			
			
		
			
			
			PreparedStatement ps=c.prepareStatement(q);
			
			ps.setString(3, a.getId());
			ps.setString(1, a.getName());
			ps.setDate(2, Date.valueOf(a.getDob()));
			
			ps.executeUpdate();
			System.out.println("Updated successfully");
			
		} catch (SQLException e) {
			throw new  Somethingwent("Not Updated");
		}
		
	}

	@Override
	public void Delete(String id) throws Somethingwent {
Connection c=null;
		
		try {
			c=Connection23.getco();
			
			String q="delete from author23 where id=?";
			
			
		
			
			
			PreparedStatement ps=c.prepareStatement(q);
			
			ps.setString(1, id);
			
			
			ps.executeUpdate();
			System.out.println("Deleted successfully");
			
		} catch (SQLException e) {
			throw new  Somethingwent("Not Updated");
		}
		
	}

}
