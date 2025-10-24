package kr.leeyujin.api.product.controller;

import java.io.Reader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.leeyujin.api.common.domain.Messenger;
import kr.leeyujin.api.product.domain.ProductDTO;
import kr.leeyujin.api.product.service.ProductService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/save")
    public String moveSave() {
        return "product/save";
    }

    @PostMapping("")
    public String save(Model model) {
        ProductDTO product = new ProductDTO();
        Messenger messenger = productService.save(product);
        model.addAttribute("messenger", messenger);
        return "product/save";
    }

    @PostMapping("/all")
    public String saveAll(Model model) {
        String csvFilePath = "src/main/resources/static/csv/products-100.csv";
        List<ProductDTO> products = new ArrayList<>();

        try {
            Reader reader = new FileReader(csvFilePath);
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withFirstRecordAsHeader());

            int count = 0;
            for (CSVRecord record : csvParser) {
                if (count >= 10)
                    break;

                ProductDTO product = new ProductDTO();
                product.setId(record.get("Index"));
                product.setName(record.get("Name"));
                product.setDescription(record.get("Description"));
                product.setBrand(record.get("Brand"));
                product.setCategory(record.get("Category"));
                product.setPrice(record.get("Price"));
                product.setCurrency(record.get("Currency"));
                product.setStock(record.get("Stock"));
                product.setEan(record.get("EAN"));
                product.setColor(record.get("Color"));
                product.setSize(record.get("Size"));
                product.setAvailability(record.get("Availability"));
                product.setInternalId(record.get("Internal ID"));

                products.add(product);
                count++;
            }
            reader.close();
            csvParser.close();

            Messenger messenger = productService.saveAll(products);
            model.addAttribute("messenger", messenger);
            model.addAttribute("products", products);
            return "product/list";

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("CSV 파일 읽기 실패: " + e.getMessage());

            Messenger messenger = new Messenger();
            messenger.setCode(500);
            messenger.setMessage("CSV 파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
            model.addAttribute("messenger", messenger);
            model.addAttribute("products", products);
            return "product/list";
        }
    }

    @PutMapping("/{id}")
    public String update(String id, Model model) {
        ProductDTO product = new ProductDTO();
        product.setId(id);
        Messenger messenger = productService.update(product);
        return "product/detail";
    }

    @DeleteMapping("/{id}")
    public String delete(String id, Model model) {
        Messenger messenger = productService.delete(id);
        return "product/list";
    }

    @GetMapping("/id/{id}")
    public String findById(String id, Model model) {
        Messenger messenger = productService.findById(id);
        return "product/detail";
    }

    @GetMapping("/all")
    public String findAll(Model model) {
        Messenger messenger = productService.findAll();
        return "product/list";
    }

}
