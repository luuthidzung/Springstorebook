package com.my_project.niit_final_project.repositories;

import com.my_project.niit_final_project.entities.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductRepository extends JpaRepository<OrderProduct,Long> {
}
