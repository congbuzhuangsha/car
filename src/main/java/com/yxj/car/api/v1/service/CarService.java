package com.yxj.car.api.v1.service;

import com.yxj.car.api.v1.pojo.Car;

import java.util.List;

/**
 * @Auther: yangxiaojie
 * @Date: 2020/3/22
 * @version: 1.0
 */
public interface CarService {

    List<Car> findAll();

    Car findById(int id);

    List<Car> findByCarName(String carName);

    void deleteById(int id);

    void updateById(Car car);

    void insertCar(Car car);
}
