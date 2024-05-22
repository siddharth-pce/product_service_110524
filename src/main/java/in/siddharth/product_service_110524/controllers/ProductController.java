package in.siddharth.product_service_110524.controllers;

import in.siddharth.product_service_110524.dtos.ProductRequestDto;
import in.siddharth.product_service_110524.dtos.ProductResponseDto;
import in.siddharth.product_service_110524.services.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping("/products/{id}")
    public ProductResponseDto getProductDetails(@PathVariable("id") int productId){
        return productService.getSingleProduct(productId);
    }

    @PostMapping("/products")
    public ProductResponseDto createProduct(@RequestBody ProductRequestDto productRequestDto){
        return productService.addProduct(
                productRequestDto.getTitle(),
                productRequestDto.getDescription(),
                productRequestDto.getImage(),
                productRequestDto.getCategory(),
                productRequestDto.getPrice()
                );
    }

    //@PutMapping("/products/{id}")
   // public ProductRequestDto updateProductRequestDto
}
