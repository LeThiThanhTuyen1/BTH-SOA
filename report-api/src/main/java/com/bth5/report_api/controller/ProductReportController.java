package com.bth5.report_api.controller;

@RestController
@RequestMapping("/reports/products")
public class ProductReportController {

    @Autowired
    private ProductReportRepository productReportRepository;

    @GetMapping
    public List<ProductReport> getAllProductReports() {
        return productReportRepository.findAll();
    }

    @GetMapping("/{id}")
    public ProductReport getProductReportById(@PathVariable Long id) {
        return productReportRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Report not found"));
    }

    @PostMapping
    public ProductReport createProductReport(@RequestBody ProductReport productReport) {
        // Tính toán lợi nhuận
        productReport.setProfit(productReport.getRevenue().subtract(productReport.getCost()));
        return productReportRepository.save(productReport);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductReport(@PathVariable Long id) {
        productReportRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
