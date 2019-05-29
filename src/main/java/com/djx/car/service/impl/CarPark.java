package com.djx.car.service.impl;

public class CarPark {

    /**
     * 停车场最小的X轴的值
     */
    private int XMin;

    /**
     * 停车场最小的Y轴的值
     */
    private int YMin;

    /**
     * 停车场最大的X轴的值
     */
    private int XMax;

    /**
     * 停车场最大的Y轴的值
     */
    private int YMax;



    public CarPark() {

    }

    public CarPark(int XMin, int YMin, int XMax, int YMax) {
        this.XMin = XMin;
        this.YMin = YMin;
        this.XMax = XMax;
        this.YMax = YMax;
    }

    public int getXMax() {
        return XMax;
    }

    public void setXMax(int XMax) {
        this.XMax = XMax;
    }

    public int getXMin() {
        return XMin;
    }

    public void setXMin(int XMin) {
        this.XMin = XMin;
    }

    public int getYMax() {
        return YMax;
    }

    public void setYMax(int YMax) {
        this.YMax = YMax;
    }

    public int getYMin() {
        return YMin;
    }

    public void setYMin(int YMin) {
        this.YMin = YMin;
    }
}
