package mybatis.pojo;

/**
 * @Author Mi
 * @Date 2022/3/26 10:23
 * @Version 1.0
 */
public class Sale {
    //唯一标识
    private Integer id;
    //购买的商品的id
    private Integer gid;
    //购买的商品的数量
    private Integer num;

    public Sale() {
    }

    public Sale(Integer id, Integer gid, Integer num) {
        this.id = id;
        this.gid = gid;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", gid=" + gid +
                ", num=" + num +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
