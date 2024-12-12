package com.bth5.report_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportingService {

    @Autowired
    private ProductReportsRepository productReportsRepository;

    @Autowired
    private OrdersReportsRepository ordersReportsRepository;

    public List<ProductReports> getAllProductReports() {
        return productReportsRepository.findAll();
    }

    public List<OrdersReports> getAllOrderReports() {
        return ordersReportsRepository.findAll();
    }

    public ProductReports getProductReportById(int id) {
        return productReportsRepository.findById(id).orElse(null);
    }

    public OrdersReports getOrderReportById(int id) {
        return ordersReportsRepository.findById(id).orElse(null);
    }

    // Thêm logic tạo báo cáo, tính toán lợi nhuận, doanh thu, chi phí tại đây
}
