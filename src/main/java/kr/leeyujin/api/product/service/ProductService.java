package kr.leeyujin.api.product.service;

import java.util.List;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.product.domain.ProductDTO;

public interface ProductService {
    Messenger save(ProductDTO product);
    Messenger saveAll(List<ProductDTO> products);
    Messenger update(ProductDTO product);
    Messenger delete(String id);
    Messenger findById(String id);
    Messenger findAll();
}
