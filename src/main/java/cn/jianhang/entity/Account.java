package cn.jianhang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  //提供构造(只有无参) , set get tostring equals  hashcode
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private int id;
    private String name;
    private double money;


}
