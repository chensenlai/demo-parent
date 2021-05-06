package com.srobber.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 应用启动
 * @author chensenlai
 * 2021-04-30 下午3:30
 */
@SpringBootApplication(scanBasePackages={"com.srobber"})
public class AppMain {

    public static void main(String[] args) {
        SpringApplication.run(AppMain.class);
    }
}
