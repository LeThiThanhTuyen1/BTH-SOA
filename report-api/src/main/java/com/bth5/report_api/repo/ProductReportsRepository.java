package com.bth5.report_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bth5.report_api.model.ProductReports;

@Repository
public interface ProductReportsRepository extends JpaRepository<ProductReports, Integer> {
}
