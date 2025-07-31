package com.wuyaohua.maven.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //有参构造
@AllArgsConstructor //无参构造
public class User {

    private Integer id;

    private String username;
    private String password;

}
