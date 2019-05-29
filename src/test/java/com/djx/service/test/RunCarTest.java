package com.djx.service.test;

import com.djx.car.service.Orientation;
import com.djx.car.service.impl.CarPark;
import com.djx.car.service.impl.Jeep;
import org.junit.Test;
public class RunCarTest {

    @Test
    public void testDriveCarSafe(){
        //定义可配置的矩形停车场大小参数：最小X轴=1,最小X轴=1,最大Y轴=4,最大Y轴=4
        CarPark carPark = new CarPark(1,1,4,4);
        //初始化吉普车的位置：在X轴=2,Y轴=3,车头朝向为东
        Jeep jeep = new Jeep(1,2, Orientation.EAST);
        jeep.setCarPark(carPark);
        //请系好安全带，吉普车马上开始启动
        try{
            System.out.println("-------------------------------");
            System.out.println(jeep.move("clockwise"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("clockwise"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("clockwise"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("clockwise"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("forward"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testCarOutMinX(){
        //定义可配置的矩形停车场大小参数：最小X轴=1,最小X轴=1,最大Y轴=4,最大Y轴=4
        CarPark carPark = new CarPark(1,1,4,4);
        //初始化吉普车的位置：在X轴=2,Y轴=3,车头朝向为东
        Jeep jeep = new Jeep(1,2, Orientation.EAST);
        jeep.setCarPark(carPark);
        //请系好安全带，吉普车马上开始启动
        try{
            System.out.println("-------------------------------");
            System.out.println(jeep.move("clockwise"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("clockwise"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("forward"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("forward"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testCarOutMinY(){
        //定义可配置的矩形停车场大小参数：最小X轴=1,最小X轴=1,最大Y轴=4,最大Y轴=4
        CarPark carPark = new CarPark(1,1,4,4);
        //初始化吉普车的位置：在X轴=2,Y轴=3,车头朝向为东
        Jeep jeep = new Jeep(1,2, Orientation.EAST);
        jeep.setCarPark(carPark);
        //请系好安全带，吉普车马上开始启动
        try{
            System.out.println("-------------------------------");
            System.out.println(jeep.move("forward"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("clockwise"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("forward"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("forward"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testCarOutMaxX(){
        //定义可配置的矩形停车场大小参数：最小X轴=1,最小X轴=1,最大Y轴=3,最大Y轴=3
        CarPark carPark = new CarPark(1,1,3,3);
        //初始化吉普车的位置：在X轴=2,Y轴=3,车头朝向为东
        Jeep jeep = new Jeep(1,2, Orientation.NORTH);
        jeep.setCarPark(carPark);
        //请系好安全带，吉普车马上开始启动
        try{
            System.out.println("-------------------------------");
            System.out.println(jeep.move("clockwise"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("forward"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("forward"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("forward"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testCarOutMaxY(){
        //定义可配置的矩形停车场大小参数：最小X轴=1,最小X轴=1,最大Y轴=3,最大Y轴=3
        CarPark carPark = new CarPark(1,1,3,3);
        //初始化吉普车的位置：在X轴=2,Y轴=3,车头朝向为东
        Jeep jeep = new Jeep(1,2, Orientation.SOUTH);
        jeep.setCarPark(carPark);
        //请系好安全带，吉普车马上开始启动
        try{
            System.out.println("-------------------------------");
            System.out.println(jeep.move("clockwise"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("clockwise"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("forward"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("forward"));
            System.out.println("-------------------------------");
            System.out.println(jeep.move("forward"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }




}
