package kr.leeyujin.api.product.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.product.domain.ProductDTO;

@Repository
public class ProductRepository{

    
    public Messenger save(ProductDTO product) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("상품 저장 성공");
        return messenger;
    }

    
    public Messenger saveAll(List<ProductDTO> products) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("상품 전체 저장 성공");
        return messenger;
        
    }

    
    public Messenger update(ProductDTO product) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("상품 수정 성공");
        return messenger;
        
    }

    
    public Messenger delete(String id) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("상품 삭제 성공");
        return messenger;
    }

    
    public Messenger findById(String id) {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("상품 조회 성공");
        return messenger;
    }

    
    public Messenger findAll() {
        Messenger messenger = new Messenger();
        messenger.setCode(200);
        messenger.setMessage("상품 전체 조회 성공");
        return messenger;
    }
    
}
