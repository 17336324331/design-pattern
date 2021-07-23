package com.chenruiyang.design.decorator;

import com.chenruiyang.design.decorator.impl.Circle;
import com.chenruiyang.design.decorator.impl.Rectangle;

/**
 * 效果测试
 * @Date 2021/7/23 11:19
 * @Author 陈瑞扬
 **/
public class DecoratorPatternDemo {
   public static void main(String[] args) {
      // 创建一个普通的圆形
      Shape circle = new Circle();
      // 创建红色图形-红色圆形
      ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
      // 创建红色图形-红色长方形
      ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
      //Shape redCircle = new RedShapeDecorator(new Circle());
      //Shape redRectangle = new RedShapeDecorator(new Rectangle());
      System.out.println("Circle with normal border");
      circle.draw();
 
      System.out.println("\nCircle of red border");
      redCircle.draw();
 
      System.out.println("\nRectangle of red border");
      redRectangle.draw();
   }
}