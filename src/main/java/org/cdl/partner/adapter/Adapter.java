package org.cdl.partner.adapter;

/**
 * 适配器类
 */
public class Adapter extends Target {
    /**
     * 注入一个被适配的类
     */
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
        System.out.println("构建适配器对象，传入被适配者对象");
    }

    @Override
    public void request(TargetData targetData) {
        AdapteeData adapteeData = convert(targetData);
        adaptee.doService(adapteeData);
    }

    private AdapteeData convert(TargetData targetData) {
        // do convert
        System.out.println("客户标准参数对象转换成 被适配者参数对象");
        return new AdapteeData();
    }
}
