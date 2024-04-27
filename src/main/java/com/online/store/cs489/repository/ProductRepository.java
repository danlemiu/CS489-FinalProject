package com.online.store.cs489.repository;

import com.online.store.cs489.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("select p from Product p")
    List<Product> findTopProduct();

    @Query("select p from Product p where p.id = :productId")
    Optional<Product> getProductById(Long productId);

    @Query(value = "select * from Product where category_id = :category_id and status = true ", nativeQuery = true)
    List<Product> findAllByCategory(@Param("category_id") Integer categoryId);

    @Query(value = "select * from Product where brand_id in (:brands) and status = true ", nativeQuery = true)
    List<Product> findAllByBrands(@Param("brands") Integer[] brandIds);

    @Query(value="SELECT * FROM Product WHERE STATUS = 1 ORDER BY NAME DESC LIMIT 12", nativeQuery = true)
    public List<Product> findTopTenAvailableProducts();

//    public Page<Product> findAll(Pageable pageable);
    // List<Product> findToProduct();

    @Query(value ="select * from Product  where seller_id = :seller_id and status = true", nativeQuery = true)
    List<Product> findAllActiveProducts(@Param("seller_id") Long sellerId);


}
