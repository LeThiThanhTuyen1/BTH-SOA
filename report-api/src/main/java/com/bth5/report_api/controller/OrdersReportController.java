package com.bth5.report_api.controller;

@RestController
@RequestMapping("/reports/orders")
public class OrdersReportController {

    @Autowired
    private OrdersReportRepository ordersReportRepository;

    @GetMapping
    public List<OrdersReport> getAllOrdersReports() {
        return ordersReportRepository.findAll();
    }

    @GetMapping("/{id}")
    public OrdersReport getOrdersReportById(@PathVariable Long id) {
        return ordersReportRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Report not found"));
    }

    @PostMapping
    public OrdersReport createOrdersReport(@RequestBody OrdersReport ordersReport) {
        // Tính toán doanh thu, chi phí, lợi nhuận nếu cần
        ordersReport.setTotalProfit(ordersReport.getTotalRevenue().subtract(ordersReport.getTotalCost()));
        return ordersReportRepository.save(ordersReport);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrdersReport(@PathVariable Long id) {
        ordersReportRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
