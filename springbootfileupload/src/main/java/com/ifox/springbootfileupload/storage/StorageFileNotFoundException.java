package com.ifox.springbootfileupload.storage;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in20:092018/4/3
 * @Modified By:
 */
public class StorageFileNotFoundException extends StorageException{
    public StorageFileNotFoundException(String message) {
        super(message);
    }

    public StorageFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
