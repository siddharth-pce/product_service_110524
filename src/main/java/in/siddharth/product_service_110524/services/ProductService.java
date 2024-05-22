package in.siddharth.product_service_110524.services;

import in.siddharth.product_service_110524.dtos.ProductResponseDto;

public interface ProductService {
    public ProductResponseDto getSingleProduct(int productId);
    public ProductResponseDto addProduct(
            String title,
            String description,
            String imageUrl,
            String category,
            double price);

    public ProductResponseDto updateProductById(
            int productId,
            String title,
            String description,
            String imageUrl,
            String category,
            double price);
}
