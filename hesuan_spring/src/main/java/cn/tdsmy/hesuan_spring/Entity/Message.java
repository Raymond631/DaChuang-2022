package cn.tdsmy.hesuan_spring.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @Author: Raymond Li
 * @Date: 2023/1/30 11:18
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message{
    private int code;
    private Object msg;

}
