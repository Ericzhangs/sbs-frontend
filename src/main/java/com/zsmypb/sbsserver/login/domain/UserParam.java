package com.zsmypb.sbsserver.login.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author zhangs.
 * @date 2019/11/7.
 */
@Data
@AllArgsConstructor
@Builder
public class UserParam {
    private String userName;
    private String passWord;
}
