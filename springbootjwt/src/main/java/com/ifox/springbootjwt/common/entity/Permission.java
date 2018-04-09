package com.ifox.springbootjwt.common.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:zhongchao
 * @Organization: ifox
 * @Description:
 * @Date:Created in13:50 2018/4/9
 * @Modified By:
 */
public class Permission{

        private static final long serialVersionUID = 1L;

        /**
         * 主键ID
         */
        private Integer id;
        /**
         * 权限名称
         */
        private String permission;
        /**
         * 权限说明
         */
        private String description;
        /**
         * 创建时间
         */
        private Date createdTime;
        /**
         * 更新时间
         */
        private Date updatedTime;

        public static long getSerialVersionUID() {
            return serialVersionUID;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getPermission() {
            return permission;
        }

        public void setPermission(String permission) {
            this.permission = permission;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public Date getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(Date createdTime) {
            this.createdTime = createdTime;
        }

        public Date getUpdatedTime() {
            return updatedTime;
        }

        public void setUpdatedTime(Date updatedTime) {
            this.updatedTime = updatedTime;
        }

        protected Serializable pkVal() {
            return this.id;
        }
}
