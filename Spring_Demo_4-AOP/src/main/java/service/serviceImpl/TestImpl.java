package service.serviceImpl;

import org.springframework.stereotype.Component;
import service.Test;

/**
 * @Author Mi
 * @Date 2022/3/23 17:54
 * @Version 1.0
 */
@Component
public class TestImpl implements Test {
    @Override
    public String doSome(Integer age) {
        System.out.println("业务方法");
        return "Aa";
    }
}
