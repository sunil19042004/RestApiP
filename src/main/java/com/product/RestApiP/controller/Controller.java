package com.product.RestApiP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.RestApiP.model.Model;
import com.product.RestApiP.service.Servicep;


@RestController
public class Controller {
	@Autowired
	public Servicep tserv;
	@GetMapping("/getUserData/{id}")
	public ResponseEntity<Model>getUserData(@PathVariable int id){
		return ResponseEntity.status(200).body(tserv.getUserData(id));
		
	}
	//posting the data
	@PostMapping("/insertingDetails")
	public String insertingDetails(@RequestBody Model t)
	{
		 tserv.postData(t);
		 return "Your data is saved successfully";
	}
	@GetMapping("/gettingDetails")
	public List<Model> gettingData(){
		return tserv.getData();
	}
	//get all row
	@GetMapping("/getAllrows")
	public List<Model> getAllRows()
	{
		return tserv.getAllRows();
	}
//	//get data
//	@GetMapping("/getSpecrows/{addr}/{name}")
//	public List<Model> getSpecrows(@PathVariable("addr") String addr,@PathVariable ("name") String name)
//	{
//		return tserv.getSpecrows(addr, name);
//	}
	//get data by char
	@GetMapping("/getByName/{char}")
	public List<Model> getByName(@PathVariable("char") String name)
	{
		return tserv.getDataByChar(name);
	}
	//delete data
	@DeleteMapping("/deleteRow/{id}")
	public String deleteRow(@PathVariable("id") int id)
	{
		return tserv.deleteById(id)+" deleted";
	}
//	//update the data
//	@PutMapping("updateData/{address}/{id}")
//	public String updateData(@PathVariable("address") String addr,@PathVariable("id") int id)
//	{
//		return tserv.updateData(addr, id)+" data is updated";
//	}
	}
