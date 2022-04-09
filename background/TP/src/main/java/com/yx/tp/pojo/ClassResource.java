package com.yx.tp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_class_res")
public class ClassResource {
    @Id
    private String id;

    /**
     * 公告还是资源
     */
    @Column(name = "class_res_type")
    private String classResType;

    /**
     * 用户资源名
     */
    @Column(name = "class_res_name")
    private String classResName;

    /**
     * 资源链接
     */
    @Column(name = "class_res_link")
    private String classResLink;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取公告还是资源
     *
     * @return class_res_type - 公告还是资源
     */
    public String getClassResType() {
        return classResType;
    }

    /**
     * 设置公告还是资源
     *
     * @param classResType 公告还是资源
     */
    public void setClassResType(String classResType) {
        this.classResType = classResType;
    }

    /**
     * 获取用户资源名
     *
     * @return class_res_name - 用户资源名
     */
    public String getClassResName() {
        return classResName;
    }

    /**
     * 设置用户资源名
     *
     * @param classResName 用户资源名
     */
    public void setClassResName(String classResName) {
        this.classResName = classResName;
    }

    /**
     * 获取资源链接
     *
     * @return class_res_link - 资源链接
     */
    public String getClassResLink() {
        return classResLink;
    }

    /**
     * 设置资源链接
     *
     * @param classResLink 资源链接
     */
    public void setClassResLink(String classResLink) {
        this.classResLink = classResLink;
    }
}