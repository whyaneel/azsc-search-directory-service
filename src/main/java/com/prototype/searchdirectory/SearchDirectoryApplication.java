package com.prototype.searchdirectory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SearchDirectoryApplication {
  public static void main(String[] args) {
    SpringApplication.run(SearchDirectoryApplication.class, args);
  }
}
