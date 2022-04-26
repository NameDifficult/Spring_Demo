package mytest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BuyGoodsService;

/**
 * @Author Mi
 * @Date 2022/3/26 16:38
 * @Version 1.0
 */
public class Test_01 {
    @Test
    public void test(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext.xml");
        BuyGoodsService bean = atc.getBean(BuyGoodsService.class);
        bean.buy(1002,500);
    }
}
