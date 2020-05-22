package entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-05-16
 * Time: 22:24
 **/
@Data
public class OrderItem {
    private Integer id;
    private String order_id;
    private Integer goods_id;
    private String goods_name;
    private String goods_introduce;
    private Integer goods_num;
    private String goods_unit;
    private Integer goods_price;
    private Integer goods_discount;
}
