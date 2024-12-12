CREATE DATABASE bth_soa;
USE bth_soa;
CREATE TABLE `bth_soa`.`users` (
  `id` INT NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(225) NOT NULL,
  token varchar(500),
  PRIMARY KEY (`id`)
);
CREATE TABLE orders_reports (
    id INT PRIMARY KEY AUTO_INCREMENT,
    order_id INT,
    total_revenue DECIMAL(10, 2),
    total_cost DECIMAL(10, 2),
    total_profit DECIMAL(10, 2)
);

CREATE TABLE product_reports (
    id INT PRIMARY KEY AUTO_INCREMENT,
    order_report_id INT,
    product_id INT,
    total_sold INT,
    revenue DECIMAL(10, 2),
    cost DECIMAL(10, 2),
    profit DECIMAL(10, 2),
    FOREIGN KEY (order_report_id) REFERENCES orders_reports(id)
);

CREATE TABLE IF NOT EXISTS products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    quantity INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
INSERT INTO products (name, description, price, quantity)
VALUES 
('Laptop Dell XPS 13', 'Laptop mỏng nhẹ với màn hình 13 inch, bộ xử lý Intel Core i7', 1500.00, 10),
('iPhone 14 Pro Max', 'Điện thoại thông minh Apple với camera 48MP và màn hình OLED 6.7 inch', 1200.00, 20),
('Samsung Galaxy S22', 'Điện thoại Samsung với màn hình 6.1 inch và bộ xử lý Snapdragon', 1000.00, 15),
('MacBook Air M2', 'Laptop MacBook Air mới nhất với chip M2 và màn hình Retina', 1400.00, 5),
('Sony WH-1000XM5', 'Tai nghe chống ồn chủ động với chất lượng âm thanh cao', 350.00, 50);