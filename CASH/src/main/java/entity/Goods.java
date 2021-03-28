package entity;

import lombok.Data;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-05-16
 * Time: 22:10
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

    private Integer buyGoogsNum;

    public double getPrice(){
        return price*1.0/100;
    }
    public int getPriceInt(){
        return price;
    }
}
