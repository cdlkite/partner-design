package org.cdl.partner.adapter;

/**
 * 被适配的类 适应者
 */
public class Adaptee {
    public Adaptee() {
        System.out.println("构建被适配者对象");
    }

    public void doService(AdapteeData adapteeData) {
        System.out.println("被适配者处理业务，要做的事，在被适配者这里。");
    }

}
