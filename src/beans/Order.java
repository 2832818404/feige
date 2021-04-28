package beans;

/**
 * @author hongxiaozheng
 * @date 2021/4/28 8:44
 */
public class Order {
    private String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                '}';
    }





}
