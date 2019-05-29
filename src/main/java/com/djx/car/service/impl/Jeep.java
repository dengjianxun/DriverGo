package com.djx.car.service.impl;

import com.djx.car.service.Car;
import com.djx.car.service.Orientation;

public class Jeep implements Car {

    private int x;
    private int y;
    private String orientation;
    private CarPark carPark;

    public CarPark getCarPark() {
        return carPark;
    }

    public void setCarPark(CarPark carPark) {
        this.carPark = carPark;
    }

    public Jeep(int x, int y, String orientation, CarPark carPark) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        this.carPark = carPark;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    /**
     * 初始化当前位置
     * @param x
     * @param y
     * @param
     */
    public Jeep(int x, int y, String orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    /**
     *clockwise、forward
     * @param command
     */
    public String move(String command) throws Exception {
        System.out.println("接收到命令"+command + " 开始位置:朝向="+this.getOrientation() + " x="+this.getPositionX()+ " y="+this.getPositionY());
        String result = "接收到命令"+command + " 开始位置:朝向="+this.getOrientation() + " x="+this.getPositionX()+ " y="+this.getPositionY();
        if("forward".equals(command)){
            if(Orientation.EAST.equals(getOrientation())){
                x++;
                result = "接收到命令"+command + " 后来位置:朝向="+this.getOrientation() + " x="+this.getPositionX()+ " y="+this.getPositionY();
                if( x > this.carPark.getXMax()){
                    throw new Exception("请小心驾驶!您当前X轴"+x+"已经超出停车场最大X轴边界值"+this.carPark.getXMax());
                }
                return result;
            }
            if(Orientation.SOUTH.equals(getOrientation())){
                y--;
                result = "接收到命令"+command + " 后来位置:朝向="+this.getOrientation() + " x="+this.getPositionX()+ " y="+this.getPositionY();
                if( y < this.carPark.getYMin()){
                    throw new Exception("请小心驾驶!您当前Y轴"+y+"已经超出停车场最小Y轴边界值"+this.carPark.getYMin());
                }
                return result;
            }
            if(Orientation.WEST.equals(getOrientation())){
                x--;
                result = "接收到命令"+command + " 后来位置:朝向="+this.getOrientation() + " x="+this.getPositionX()+ " y="+this.getPositionY();
                if( x < this.carPark.getXMin()){
                    throw new Exception("请小心驾驶!您当前X轴"+x+"已经超出停车场最小X轴边界值"+this.carPark.getXMin());
                }
                return result;
            }if(Orientation.NORTH.equals(getOrientation())){
                y++;
                result = "接收到命令"+command + " 后来位置:朝向="+this.getOrientation() + " x="+this.getPositionX()+ " y="+this.getPositionY();
                if( y > this.carPark.getYMax()){
                    throw new Exception("请小心驾驶!您当前Y轴"+y+"已经超出停车场最大Y轴边界值"+this.carPark.getYMax());
                }
                return result;
            }
        }
        if("clockwise".equals(command)){
            if(Orientation.EAST.equals(getOrientation())){
                this.setOrientation(Orientation.SOUTH);
                result = "接收到命令"+command + " 后来位置:朝向="+this.getOrientation() + " x="+this.getPositionX()+ " y="+this.getPositionY();
                return result;
            }
            if(Orientation.SOUTH.equals(getOrientation())){
                this.setOrientation(Orientation.WEST);
                result = "接收到命令"+command + " 后来位置:朝向="+this.getOrientation() + " x="+this.getPositionX()+ " y="+this.getPositionY();
                return result;
            }
            if(Orientation.WEST.equals(getOrientation())){
                this.setOrientation(Orientation.NORTH);
                result = "接收到命令"+command + " 后来位置:朝向="+this.getOrientation() + " x="+this.getPositionX()+ " y="+this.getPositionY();
                return result;
            }if(Orientation.NORTH.equals(getOrientation())){
                this.setOrientation(Orientation.EAST);
                result = "接收到命令"+command + " 后来位置:朝向="+this.getOrientation() + " x="+this.getPositionX()+ " y="+this.getPositionY();
                return result;
            }
        }
        return "该车目前还不支持指令"+command;
    }

    public int getPositionX() {
        return x;
    }

    public int getPositionY() {
        return y;
    }

    public String getOrientation() {
        return orientation;
    }
}
