package mybatis.mappers;

import mybatis.pojo.Sale;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Mi
 * @Date 2022/3/26 10:31
 * @Version 1.0
 */
public interface SaleMapper {
    //购买商品
    int insertSale(@Param("sale") Sale sale);
}
