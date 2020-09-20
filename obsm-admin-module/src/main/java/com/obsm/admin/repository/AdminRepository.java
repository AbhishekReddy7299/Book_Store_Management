package com.obsm.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.obsm.admin.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

}
