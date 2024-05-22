package in.siddharth.product_service_110524.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
public class BaseModel {
    //@Id
    //@Ge
    private Long id;
    //private Date createdAt;
  //  private Date updatedAt;
    private Boolean isDeleted = false;

}