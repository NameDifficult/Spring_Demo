package service.serviceImpl;

import service.SomeService3;

/**
 * @Author Mi
 * @Date 2022/3/21 15:58
 * @Version 1.0
 */
public class SomeService3Impl implements SomeService3 {
    @Override
    public String doSome(String name) {
        System.out.println("业务方法    " + name);
        return name;
    }
}
