package service.serviceImpl;

import service.SomeService5;

/**
 * @Author Mi
 * @Date 2022/3/23 16:47
 * @Version 1.0
 */
public class SomeService5Impl implements SomeService5 {
    @Override
    public void doAfter() {
        System.out.println("业务方法");
    }
}
