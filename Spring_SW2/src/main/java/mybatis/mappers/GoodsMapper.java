package mybatis.mappers;

import mybatis.pojo.Goods;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Mi
 * @Date 2022/3/26 10:32
 * @Version 1.0
 */
public interface GoodsMapper {
    //查询商品
    Goods selectGoodsByID(@Param("id") Integer id);

    //更新库存
    int updateGoods(@Param("goods") Goods goods);
}
