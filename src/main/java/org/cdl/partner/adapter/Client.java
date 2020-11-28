package org.cdl.partner.adapter;

/***
 * 客户类
 */
public class Client {

    public static void main(String[] args) {
        TargetData targetData = new TargetData();

        Adaptee adaptee = new Adaptee();
        Target target = new Adapter(adaptee);

        target.request(targetData);
    }

}
