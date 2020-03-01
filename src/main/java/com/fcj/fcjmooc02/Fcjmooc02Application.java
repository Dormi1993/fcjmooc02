package com.fcj.fcjmooc02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//扫描 mybatis mapper 包路径
@MapperScan(basePackages = "com.fcj.fcjmooc02.mapper")
//扫描 所有需要的包, 包含一些自用的工具类包 所在的路径
// 重要！！这样写是会报错的，因为这一行是springBoot默认的路径，
// 不需要重复写@ComponentScan(basePackages= {"com.fcj.fcjmooc02"})
// 下面这行因为有两个不同的包的位置，所以是可以的
@ComponentScan(basePackages= {"com.fcj.fcjmooc02", "org.n3r.idworker"})
public class Fcjmooc02Application {

	// https://github.com/leechenxiang/imooc-springboot-starter

	public static void main(String[] args) {
		SpringApplication.run(Fcjmooc02Application.class, args);
	}

}
