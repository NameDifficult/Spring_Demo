package proxy;

import MyAspects.MyAspectBefore;
import service.SomeService;
import service.serviceImpl.SomeServiceImpl;

/**
 * @Author Mi
 * @Date 2022/3/21 14:50
 * @Version 1.0
 */

/**
 * 实则上生成了代理就是这样的
 */
public class ServiceProxy implements SomeService {
    //真正的目标
    SomeService service = new SomeServiceImpl();
    MyAspectBefore myAspectBefore = new MyAspectBefore();
    @Override
    public void doSome(String name, Integer age) {
        myAspectBefore.myBefore();
        service.doSome(name,age);
    }
}
