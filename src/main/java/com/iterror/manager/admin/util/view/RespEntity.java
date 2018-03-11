package com.iterror.manager.admin.util.view;

import lombok.Data;

/**
 * Created by tony.yan on 2018/1/2.
 */
@Data
public class RespEntity {

    /**
     * 返回码
     */
    private int    rc;

    /**
     * 对应rc的提示信息
     */
    private String msg;

    /**
     * 返回数据
     */
    private Object data;

    public RespEntity(){
        this(RespCode.SUCCESS);
    }

    public RespEntity(RespCode respCode) {
        this.rc = respCode.getCode();
        this.msg = respCode.getMsg();
    }

    public RespEntity(int code,String msg) {
        this.rc = code;
        this.msg = msg;
    }

    public RespEntity(RespCode respCode, Object data) {
        this(respCode);
        this.data = data;
    }

    public RespEntity(Object data) {
        this(RespCode.SUCCESS);
        this.data = data;
    }

    /**
     * @return
     */
    public static RespEntity success(Object data) {
        RespEntity baseResult = new RespEntity(RespCode.SUCCESS);
        baseResult.setData(data);
        return baseResult;
    }

    public static RespEntity success() {
        return new RespEntity(RespCode.SUCCESS);
    }

    /**
     * @param rc
     * @param msg
     * @return
     */
    public static RespEntity fail(int rc, String msg) {
        return  new RespEntity(rc,msg);
    }
}
