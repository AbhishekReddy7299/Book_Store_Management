package com.obsm.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.obsm.admin.exception.AdminNotFound;
import com.obsm.admin.model.Admin;
import com.obsm.admin.payload.AdminUpdateRequest;
import com.obsm.admin.service.IAdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	IAdminService service;
	
	@PostMapping("/addAdmin")
	public ResponseEntity<Admin> addTask(@RequestBody Admin admin){
		return (service.addAdmin(admin));
	}

	@DeleteMapping("/deleteAdmin/{adminId}")
	public ResponseEntity deleteTask(@PathVariable long adminId) throws AdminNotFound {
		return service.deleteAdmin(adminId);
	}

	@PutMapping("/updateAdmin/{adminId}")
	public ResponseEntity<Admin> updateTask(@RequestBody AdminUpdateRequest adminUpdateRequest, @PathVariable long adminId) throws AdminNotFound {
		return service.updateAdmin(adminUpdateRequest, adminId);
	}

	@GetMapping("getAdmin/{adminId}")
	public ResponseEntity<Admin> getTask(@PathVariable long adminId) throws AdminNotFound {
		return service.getAdmin(adminId);
	}

	@GetMapping("/getAllAdmins")
	public ResponseEntity<List<Admin>> getAllTasks() {
		return service.getAllTasks();
	}
}
