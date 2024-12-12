package com.bth5.report_api.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_reports")
public class ProductReports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order_report_id")
    private int orderReportId;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "total_sold")
    private int totalSold;

    @Column(name = "revenue", precision = 10, scale = 2)
    private BigDecimal revenue;

    @Column(name = "cost", precision = 10, scale = 2)
    private BigDecimal cost;

    @Column(name = "profit", precision = 10, scale = 2)
    private BigDecimal profit;

	public ProductReports(int id, int orderReportId, int productId, int totalSold, BigDecimal revenue, BigDecimal cost,
			BigDecimal profit) {
		this.id = id;
		this.orderReportId = orderReportId;
		this.productId = productId;
		this.totalSold = totalSold;
		this.revenue = revenue;
		this.cost = cost;
		this.profit = profit;
	}

	public ProductReports() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderReportId() {
		return orderReportId;
	}

	public void setOrderReportId(int orderReportId) {
		this.orderReportId = orderReportId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getTotalSold() {
		return totalSold;
	}

	public void setTotalSold(int totalSold) {
		this.totalSold = totalSold;
	}

	public BigDecimal getRevenue() {
		return revenue;
	}

	public void setRevenue(BigDecimal revenue) {
		this.revenue = revenue;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	public BigDecimal getProfit() {
		return profit;
	}

	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}
}
