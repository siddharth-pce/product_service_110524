package in.siddharth.product_service_110524.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel{
    private int id;
    private String title;
    private String description;
    private Double price;
    private String imageUrl;
    private Category category;


}
