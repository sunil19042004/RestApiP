package com.product.RestApiP.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.product.RestApiP.model.Model;

import jakarta.transaction.Transactional;
@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Model, Integer>{
	//native Query
	@Query(value = "select * from _product",nativeQuery = true)
	public List<Model> getAllRows();
	
//	@Query(value = "select * from _product where country =:addr and name =:name" ,nativeQuery = true)
//	public List<Model> getSpecRows(@Param("addr") String addr,@Param("name") String name);
	
	//get by char
	@Query (value = "select * from _product where name like %?1%",nativeQuery = true)
	public List<Model> getByname(@Param("name") String name);
	
	//delete using native query
	@Modifying
	@Transactional
	@Query(value = "delete from _product where id=:no_id",nativeQuery = true)
	public int deleteId(@Param("no_id") int id);
	
//	@Modifying
//	@Transactional
//	@Query(value="update _product set country=:addr where id=:no_id",nativeQuery = true)
//	public int updateById(@Param("addr") String addr,@Param("no_id") int id);
	
//	@Modifying
//	@Transactional
	@Query(value="select * from _product join _order.id = _product._order.id where _order.id = ?1",nativeQuery=true)
	Model getUserData(int id);


}

