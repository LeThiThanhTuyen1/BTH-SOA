package com.bth5.report_api;

@FeignClient(name = "product-service", url = "http://localhost:8081")
public interface ProductServiceClient {
    
    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable("id") Long productId);
}

