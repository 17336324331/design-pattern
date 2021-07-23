package com.chenruiyang.design.decorator;

/**
 * 图形接口-图形装饰者-红色边框图形
 * @Date 2021/7/23 11:19
 * @Author 陈瑞扬
 **/
public class RedShapeDecorator extends ShapeDecorator {
 
   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);     
   }
 
   @Override
   public void draw() {
      decoratedShape.draw();         
      setRedBorder(decoratedShape);
   }
 
   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
}