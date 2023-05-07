package com.dao;

import com.dto.Author2;

import jaaftercom.excep.Somethingwent;

public interface Interface {

	public void add(Author2 a) throws Somethingwent;

	public void Update(Author2 a) throws Somethingwent;

	public void Delete(String id) throws Somethingwent;

}
