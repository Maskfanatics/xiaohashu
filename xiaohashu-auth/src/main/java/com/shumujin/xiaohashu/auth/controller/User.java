package com.shumujin.xiaohashu.auth.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author: riversome1
 * @date: 2024/6/20 19:00
 * @description:
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String nickName;

    private LocalDateTime createTime;
}
