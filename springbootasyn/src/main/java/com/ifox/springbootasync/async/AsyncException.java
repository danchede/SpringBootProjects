package com.ifox.springbootasync.async;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:19 2018/4/9
 * @Modified By:
 */
public class AsyncException extends RuntimeException {
    public AsyncException(){
        super();
    }
    public AsyncException(String msg){
        super(msg);
    }
    public AsyncException(int code,String msg){
        super(msg);
        this.code = code;
    }
    private int code;
    public int getCode(){
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
