package com.yxj.car.api.v1.dao;

import com.yxj.car.api.v1.pojo.Car;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Auther: yangxiaojie
 * @Date: 2020/3/22
 * @version: 1.0
 */
@Mapper
public interface CarDao {
    @Select("select * from carMessage")
    List<Car> findAll();

    @Select("select * from carMessage where id = #{id}")
    Car findById(int id);

    @Select("select * from carMessage where carName = #{carName}")
    List<Car> findByCarName(String carName);

    @Delete("delete from carMessage where id = #{id}")
    void deleteById(int id);

    @Update("update carMessage set carName=#{carName},carType=#{carType},price=#{price},carSeries=#{carSeries} where id = #{id}")
    void updateById( Car car);

    @Insert("insert into carMessage(carName,carType,price,carSeries) values(#{carName},#{carType},#{price},#{carSeries})")
    void insertCar(Car car);
}
