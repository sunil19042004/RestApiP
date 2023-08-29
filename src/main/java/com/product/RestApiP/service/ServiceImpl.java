//package com.product.RestApiP.service;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.product.RestApiP.model.Model;
//import com.product.RestApiP.repository.Repository;
//
//import jakarta.transaction.Transactional;
//
//@Service
//@Transactional
//public class ServiceImpl implements Servicep{
//	@Autowired
//	private Repository userRepository;
//	
//	public boolean addUser(Model user) {
//		
//		boolean userExists=userRepository.existsById(user.getId());
//		if(!userExists) {
//			userRepository.save(user);
//			return true;
//		}else {
//			return false;
//		}
//	}
//	
//	public List<Model>getUser(){
//		return userRepository.findAll();
//	}
//	@Override
//	public boolean updateUser(int id,Model user) {
////		userRepository.saveAndFlush(user);
//		Optional<Model> existingUserOptional=userRepository.findById(id);
//		if(existingUserOptional.isPresent()){
//		Model userExists=existingUserOptional.get();
//		userExists.setName(user.getName());
//		userExists.setDescription(user.getDescription());
//		userExists.setPrice(user.getPrice());
//		
//		userRepository.save(userExists);
//		return true;
//		} else {
//		return false;
//		}
//	}
//	public boolean deleteUser(int id) {
//		// TODO Auto-generated method stub
//		Optional<Model>existingUserOptional=userRepository.findById(id);
//		if(existingUserOptional.isPresent()) {
//		userRepository.deleteById(id);
//		return true;
//	}
//		return false;
//	}
//	@Override
//	public String value() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public boolean getUser(Model model) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//}
//
//
