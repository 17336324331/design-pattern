package com.chenruiyang.design.decorator;

/**
 * 图形接口-图形装饰者
 * @Date 2021/7/23 11:19
 * @Author 陈瑞扬
 **/
public abstract class ShapeDecorator implements Shape {

   protected Shape decoratedShape;

   /**
    * 构造器
    * @Date 2021/7/23 11:23
    * @Author 陈瑞扬
    * @param decoratedShape
    * @return
    */
   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   /**
    * 画图方法
    * @Date 2021/7/23 11:19
    * @Author 陈瑞扬
    * @param
    * @return void
    */
   public void draw(){
      decoratedShape.draw();
   }  
}