package kr.leeyujin.api.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.product.domain.ProductDTO;
import kr.leeyujin.api.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    @Override
    public Messenger save(ProductDTO product) {
        return productRepository.save(product);
    }

    @Override
    public Messenger saveAll(List<ProductDTO> products) {
        return productRepository.saveAll(products);
        
    }

    @Override
    public Messenger update(ProductDTO product) {
        return productRepository.update(product);
    }

    @Override
    public Messenger delete(String id) {
        return productRepository.delete(id);
    }

    @Override
    public Messenger findById(String id) {
        return productRepository.findById(id);
    }

    @Override
    public Messenger findAll() {
        return productRepository.findAll();
    }
    
}
