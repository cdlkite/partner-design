package org.cdl.partner.adapter;

/***
 * 适配器是一种结构型设计模式， 它能使不兼容的对象能够相互合作。
 * 适配器可担任两个对象间的封装器， 它会接收对于一个对象的调用， 并将其转换为另一个对象可识别的格式和接口。
 *
 * 实现时使用了构成原则： 适配器实现了其中一个对象的接口， 并对另一个对象进行封装。 所有流行的编程语言都可以实现适配器。
 *
 * 举例：客户的手机，手机端的接口是标准，不能被改变的，而世界各地的插头是不一样的，适配器的作用就是适配世界各地的插头，适配器类会有多个实现。
 *
 *
 */
public class Demo {

    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println("roundHole match roundPeg result : " + roundHole.isFit(roundPeg));

        SquarePeg squarePeg = new SquarePeg(2);
        SquarePeg squarePeg1 = new SquarePeg(10);

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        SquarePegAdapter squarePegAdapter1 = new SquarePegAdapter(squarePeg1);

        System.out.println("roundHole match squarePegAdapter result : " + roundHole.isFit(squarePegAdapter));
        System.out.println("roundHole match squarePegAdapter1 result : " + roundHole.isFit(squarePegAdapter1));





    }
}
