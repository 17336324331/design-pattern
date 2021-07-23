package com.chenruiyang.design.decorator.impl;

import com.chenruiyang.design.decorator.Shape;

/**
 * 图形接口实现之圆形
 * @Date 2021/7/23 11:19
 * @Author 陈瑞扬
 **/
public class Circle implements Shape {

   /**
    * 画一个圆形
    * @Date 2021/7/23 11:20
    * @Author 陈瑞扬
    * @param
    * @return void
    */
   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }
}