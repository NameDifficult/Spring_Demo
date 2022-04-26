package service.serviceImpl;

import exception.NotEnougthException;
import mybatis.mappers.GoodsMapper;
import mybatis.mappers.SaleMapper;
import mybatis.pojo.Goods;
import mybatis.pojo.Sale;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import service.BuyGoodsService;

/**
 * @Author Mi
 * @Date 2022/3/26 10:51
 * @Version 1.0
 */
public class BuyGoodsServiceImpl implements BuyGoodsService {


    private SaleMapper saleMapper;
    private GoodsMapper goodsMapperOne;

    public void setSaleMapper(SaleMapper saleMapper) {
        this.saleMapper = saleMapper;
    }

    public void setGoodsMapper(GoodsMapper goodsMapperOne) {
        this.goodsMapperOne = goodsMapperOne;
    }

    /**
     * 事务注解
     * @Transactional： 特点：适合中小型项目，使用方便，效率高
     *              关于属性 rollbackFor：
     *                          1. 框架首先检查方法抛出的异常是不是在rollbackFor数组中，如果在一定回滚
     *                          2. 如果方法抛出的异常不在rollbackFor数组中，框架会继续检查抛出的异常是不是runtimeException
     *                                  如果是一定回滚
     *                          3.
     * @param goodsId
     * @param num
     */
    @Transactional(propagation = Propagation.REQUIRED,
            isolation = Isolation.DEFAULT,
            readOnly = false,
            timeout = 20,
            rollbackFor = {NullPointerException.class,NotEnougthException.class})
    @Override
    public void buy(Integer goodsId, Integer num) {
        System.out.println("--------buy方法的开始----------");

        //生成销售记录
        Sale sale = new Sale(null,goodsId,num);
        saleMapper.insertSale(sale);

        //查询商品
        Goods goods = goodsMapperOne.selectGoodsByID(goodsId);
        if (goods == null){
            throw new NullPointerException("商品不存在");
        }else if (goods.getAmount() < num){
            throw new NotEnougthException("库存不足");
        }

        //更新库存
        Goods goods1 = new Goods();
        goods1.setId(goodsId);
        goods1.setAmount(num);
        goodsMapperOne.updateGoods(goods1);


        System.out.println("--------buy方法的结束----------");
    }
}
