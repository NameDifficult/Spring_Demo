package service.serviceImpl;

import service.SomeService;

/**
 * @Author Mi
 * @Date 2022/3/21 14:21
 * @Version 1.0
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        System.out.println("业务方法duSome");
    }
}
