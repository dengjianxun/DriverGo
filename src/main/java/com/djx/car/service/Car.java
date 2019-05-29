package com.djx.car.service;

public interface Car {

    /**
     *
     * @return
     */
    String move(String command) throws Exception;

    int getPositionX();

    /**
     *
     * @return
     */
    int getPositionY();

    /**
     *
     * @return
     */
    String getOrientation();

}
