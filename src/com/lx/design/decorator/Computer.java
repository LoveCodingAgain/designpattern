package com.lx.design.decorator;

/**
 * title： com.lx.design.decorator
 * @author： lixing
 * date： 2018/9/1 14:51
 * description：
 */
public class Computer implements AbstractComputer{
    @Override
    public String name() {
        return "普通电脑";
    }

    @Override
    public double price() {
        return 3000.00;
    }
}
