package com.akka.demo.module.message;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author skyfour
 * @date 2019-10-28
 * @email skyzhang@easemob.com
 */
@Data
@AllArgsConstructor
public class Message {
    private String userId;

    private String message;
}
