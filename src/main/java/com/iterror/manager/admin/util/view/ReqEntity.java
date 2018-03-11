package com.iterror.manager.admin.util.view;

import lombok.Data;

/**
 * Created by tony.yan on 2018/1/10.
 */
@Data
public class ReqEntity {

    private BaseReqEntity base;
    private long          t;    // 请求时间
    private String        sign; // 签名值
}
