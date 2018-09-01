package com.lx.design.decorator;

/**
 * title： com.lx.design.decorator
 * @author： lixing
 * date： 2018/9/1 14:46
 * description：
 */
public class Memory extends  Device {

    public AbstractComputer computer;

    public Memory(AbstractComputer computer) {
        this.computer = computer;
    }

    @Override
    public String name() {
        return computer.name() + "加内存";
    }

    @Override
    public double price() {
        return computer.price() + 300;
    }

}
