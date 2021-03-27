package entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-26
 * Time: 22:54
 **/
@Data
public class Goods {
    private Integer id;
    private String name;
    private String introduce;
    private Integer stock;
    private String unit;
    private Integer price;
    private Integer discount;
}
