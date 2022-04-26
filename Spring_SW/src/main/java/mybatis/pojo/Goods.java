package mybatis.pojo;

/**
 * @Author Mi
 * @Date 2022/3/26 10:25
 * @Version 1.0
 */
public class Goods {
    //商品的id
    private Integer id;
    //商品名称
    private String name;
    //商品的库存
    private Integer amount;
    //商品的单价
    private Float price;

    public Goods(Integer id, String name, Integer amount, Float price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public Goods() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
