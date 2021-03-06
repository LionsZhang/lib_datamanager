package com.wowly.lib.datamanager.storage;

/**
 * @author: lionszhang
 * @Filename:
 * @Description:
 * @date: 2017/5/10 10:17
 */

public interface IStorageObject {
    /**
     * 存储对象
     *
     * @param key   存储key
     * @param value 待存储对象
     */
    void putObject(String key, Object value);

    /**
     * 获取对象
     *
     * @param key      获取对象的key
     * @param defValue 默认对象
     * @return 返回存储的对象
     */
    Object getObject(String key, Object defValue);
}
