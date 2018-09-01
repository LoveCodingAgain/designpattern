package com.lx.design.decorator;
/**
 * title： com.lx.design.decorator
 * @author： lixing
 * date： 2018/9/1 14:52
 * description：
 */
public class DecoratorClient {
    public static void main(String[] args) {
        Computer computer=new Computer();
        HardDisk h = new HardDisk(computer);
        System.out.println(h.name());
        System.out.println("价格:"+h.price());

        Memory m = new Memory(computer);
        System.out.println(m.name());
        System.out.println("价格:"+m.price());

        HardDisk h1=new HardDisk(m);
        System.out.println(h1.name());
        System.out.println("价格:"+h1.price());
    }
}
