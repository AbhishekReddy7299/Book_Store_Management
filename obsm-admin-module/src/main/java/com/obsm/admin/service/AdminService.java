package com.obsm.admin.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.obsm.admin.exception.AdminNotFound;
import com.obsm.admin.model.Admin;
import com.obsm.admin.payload.AdminUpdateRequest;
import com.obsm.admin.repository.AdminRepository;
import com.obsm.admin.utils.Helper;

@Service
@Transactional
public class AdminService implements IAdminService{
	
	@Autowired
    AdminRepository adminRepository;
	
	public ResponseEntity<Admin> addAdmin(Admin admin) {
		try {
			if (admin != null) {
				return new ResponseEntity<>(adminRepository.save(admin), HttpStatus.CREATED);
			} else throw new AdminNotFound("Not a valid request");
		}catch(AdminNotFound adminNotFound){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity deleteAdmin(long adminId) throws AdminNotFound {
		try {
			Admin deletedAdmin = adminRepository.getOne(adminId);
			if (adminRepository.existsById(adminId)) {
				adminRepository.delete(deletedAdmin);
				return new ResponseEntity(HttpStatus.OK);
			} else throw new AdminNotFound("Admin is Null");
		}catch (AdminNotFound adminNotFound){
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}catch(Exception exception){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity<Admin> updateAdmin(AdminUpdateRequest adminUpdateRequest, long adminId) throws AdminNotFound {
		try {
			Admin updatedAdmin = adminRepository.getOne(adminId);
			if (!adminRepository.existsById(adminId)) {
				throw new AdminNotFound("Admin doesn't exists!");
			}
			Helper.copyAdminDetails(updatedAdmin, adminUpdateRequest);
			return new ResponseEntity<>(adminRepository.save(updatedAdmin),HttpStatus.ACCEPTED);
		}catch(AdminNotFound adminNotFound){
			return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
		}
	}

	 public ResponseEntity<Admin> getAdmin(long adminId) throws AdminNotFound {
		try {
			Admin admin = adminRepository.getOne(adminId);
			if(adminRepository.existsById(adminId))
				return new ResponseEntity<>(admin, HttpStatus.FOUND);
			else throw new AdminNotFound("No Admin is available");
		}catch (AdminNotFound adminNotFound){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}catch(Exception exception){
			return new ResponseEntity(HttpStatus.BAD_REQUEST);
		}
	}

	public ResponseEntity<List<Admin>> getAllTasks() {
			return new ResponseEntity(adminRepository.findAll(),HttpStatus.FOUND);
	}

}
