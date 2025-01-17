package in.siddharth.product_service_110524.services;

import in.siddharth.product_service_110524.dtos.FakeStoreDto;
import in.siddharth.product_service_110524.dtos.ProductResponseDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakeStoreProductService implements ProductService {
    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }
    @Override
    public ProductResponseDto getSingleProduct(int productId) {
        FakeStoreDto fakeStoreDto = restTemplate.getForObject(
                "https://fakestoreapi.com/products/"+ productId,
                FakeStoreDto.class
        );

        return fakeStoreDto.toProductResponseDto();
    }

    @Override
    public ProductResponseDto addProduct(
            String title,
            String description,
            String imageUrl,
            String category,
            double price){

        FakeStoreDto fakeStoreDto = new FakeStoreDto();
        fakeStoreDto.setTitle(title);
        fakeStoreDto.setDescription(description);
        fakeStoreDto.setImage(imageUrl);
        fakeStoreDto.setCategory(category);
        fakeStoreDto.setPrice(price);


        FakeStoreDto response = restTemplate.postForObject(
                "https://fakestoreapi.com/products/",
                fakeStoreDto,
                FakeStoreDto.class
        );

        return fakeStoreDto.toProductResponseDto();
    }

    @Override
    public ProductResponseDto updateProductById(
            int productId,
            String title,
            String description,
            String imageUrl,
            String category,
            double price){

        FakeStoreDto fakeStoreDto = new FakeStoreDto();
        fakeStoreDto.setTitle(title);
        fakeStoreDto.setDescription(description);
        fakeStoreDto.setImage(imageUrl);
        fakeStoreDto.setCategory(category);
        fakeStoreDto.setPrice(price);


      //  FakeStoreDto response = restTemplate.put(
       //         "https://fakestoreapi.com/products/"+ productId,
       //         fakeStoreDto
       // );

        return fakeStoreDto.toProductResponseDto();
    }
}
