package myTest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.BuyGoodsService;

/**
 * @Author Mi
 * @Date 2022/3/26 14:58
 * @Version 1.0
 */
public class TestOne {
    @Test
    public void testO(){
        ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext.xml");
        BuyGoodsService bean = atc.getBean(BuyGoodsService.class);
        bean.buy(1009,10);
    }
}
