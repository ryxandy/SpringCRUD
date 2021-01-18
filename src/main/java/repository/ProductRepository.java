package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
