package com.example.demo.repository;

import com.example.demo.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProvinceRepository extends JpaRepository<Province,Long> {
}
