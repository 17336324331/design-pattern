package com.chenruiyang.design.other;

/**
 *
 * question: 静态属性和方法能否被继承?
 *
 * answer: 可以被继承但是不能被重写，无法体现多态。
 *          子父类有相同的方法
 *
 *          1.如果这个方法是成员方法(又叫实例方法，非静态方法)： 叫子类重写父类，需要添加@Override,在进行引用时，会根据子类的不同，动态调用方法
 *          Parent child = new Son();
 *          child.method();  会动态调用子类的方法
 *
 *          2.如果这个方法是静态方法，叫子类的静态方法 和父类的同名方法没有任何关系
 *          Parent child = new Son();
 *          child.staticMethod();  只会调用父类方法，
 *          因为这个实例对象(child)是Parent.class类型的，只会调用Parent.class的staticMethod
 *          而且建议用类名直接调用静态方法，不要用实例修改方法;
 **/
/**
 * 静态属性和方法能否被继承
 * @Date 2021/7/23 11:19
 * @Author 陈瑞扬
 **/
class Parent {
    public static void  staticMethod(){
        System.out.println("Parent staticMethod run");
    }
    public void method(){
        System.out.println("Parent method run");
    }
}

class Son extends Parent {
    public static void  staticMethod(){
        System.out.println("Son staticMethod run");
    }
    @Override
    public void method(){
        System.out.println("Son method run");
    }

}

class Test {
    public static void main(String[] args) {
        Parent child=new Son();
        child.staticMethod();

        //输出：Parent staticMethod run 这不是多态

        Son s=new Son();
        s.staticMethod();//输出：Son staticMethod run
        child.method();//这样才存在多态

        // 多态是自行

    }

}