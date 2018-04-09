package com.ifox.springbootjwt.api.model;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in19:08 2018/4/9
 * @Modified By:    入网绑定返回
 */
public class JoinBindResponse<T> extends BaseResponse<T> {
    /**
     * 返回码 1:已入网并绑定了网点 2:已入网但尚未绑定网点 3:未入网
     */
    private int code;

    /**
     * 机具状态: 1:正常 2:故障 3:维修中(返厂) 4:已禁用(丢失) 5:已停用(回收)
     */
    private Integer posState;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Integer getPosState() {
        return posState;
    }

    public void setPosState(Integer posState) {
        this.posState = posState;
    }
}
