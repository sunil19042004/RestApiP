package com.product.RestApiP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.RestApiP.model.Model;
import com.product.RestApiP.repository.Repository;

@Service
public class Servicep {
	@Autowired
	public Repository trepo;
	
	//post data
	public String postData(Model t)
	{
		trepo.save(t);
		return "Your data is saved successfully";
	}
	//getdata
	public List<Model> getData()
	{
		return trepo.findAll();
	}

	//get all data
	public List<Model> getAllRows()
	{
		return trepo.getAllRows();
	}
//	//get Spec data
//	public List<Model> getSpecrows(String addr,String name)
//	{
//		return trepo.getSpecRows(addr, name);
//	}
	//get by Char
	public List<Model> getDataByChar(String name)
	{
		return trepo.getByname(name);
	}
	//delete the data
	public int deleteById(int id)
	{
		return trepo.deleteId(id);
	}
//	//update the data 
//	public int updateData(String addr,int no_id) {
//		return trepo.updateById(addr, no_id);
//	}
	public Model getUserData(int id) {
	return trepo.getUserData(id);
	}

}