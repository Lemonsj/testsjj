package entity;
import commen.OrderStatus;
import lombok.Data;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2020-05-16
 * Time: 22:13
 **/
@Data
public class Order {
    private String id;
    private Integer account_id;
    private String account_name;
    private String create_time;
    private String finish_time;
    private Integer actual_amount;
    private Integer total_money;
    private OrderStatus order_status;

}
