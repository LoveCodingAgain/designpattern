package com.lx.design.decorator;

/**
 * title： com.lx.design.decorator
 * @author： lixing
 * date： 2018/9/1 14:48
 * description：
 */
public class HardDisk extends Device{

    public AbstractComputer computer;

    public HardDisk(AbstractComputer computer) {
        this.computer = computer;
    }
    @Override
    public String name() {
        return computer.name() + "加硬盘";
    }

    @Override
    public double price() {
        return computer.price() + 500;
    }


}
