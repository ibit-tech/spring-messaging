package com.example.message.rabbitmq;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 定义消息体
 *
 * @author ben
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RabbitMqMessage implements Serializable {

    /**
     * 接收者
     */
    private String to;

    /**
     * 接收内容
     */
    private String content;
}
