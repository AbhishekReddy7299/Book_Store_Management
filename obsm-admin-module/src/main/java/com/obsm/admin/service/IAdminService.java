package com.obsm.admin.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.obsm.admin.exception.AdminNotFound;
import com.obsm.admin.model.Admin;
import com.obsm.admin.payload.AdminUpdateRequest;

public interface IAdminService {
	public ResponseEntity<Admin> addAdmin(Admin admin);
	public ResponseEntity deleteAdmin(long adminId) throws AdminNotFound;
	public ResponseEntity<Admin> updateAdmin(AdminUpdateRequest adminUpdateRequest, long adminId) throws AdminNotFound;
	public ResponseEntity<Admin> getAdmin(long adminId) throws AdminNotFound;
	public ResponseEntity<List<Admin>> getAllTasks();
}
