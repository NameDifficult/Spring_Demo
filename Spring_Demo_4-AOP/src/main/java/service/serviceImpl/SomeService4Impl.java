package service.serviceImpl;

import service.SomeService4;

/**
 * @Author Mi
 * @Date 2022/3/21 16:54
 * @Version 1.0
 */
public class SomeService4Impl implements SomeService4 {
    @Override
    public void doSome(String name) {
        System.out.println("业务方法执行了 " + (10/0));
    }
}
