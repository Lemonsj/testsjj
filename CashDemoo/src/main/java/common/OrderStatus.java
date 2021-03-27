package common;

/**
 * Created with IntelliJ IDEA
 * Description:
 * User: 孙洁
 * Date: 2021-03-26
 * Time: 23:19
 **/
public enum OrderStatus {
    PAYING(1,"待支付"),OK(2,"支付完成");

    private int id;
    private String status;
    OrderStatus(int id, String status) {
        this.id = id;
        this.status = status;
    }
}
