package pt.raphaelneves.shipping.adapter.repository;

import pt.raphaelneves.shipping.domain.entity.SupplierProduct;
import pt.raphaelneves.shipping.domain.port.SupplierProductRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface SupplierProductJpaRepository extends JpaRepository<SupplierProduct, Long>, SupplierProductRepository {
    @Override
    List<SupplierProduct> findAllByProductName(String name);
}
