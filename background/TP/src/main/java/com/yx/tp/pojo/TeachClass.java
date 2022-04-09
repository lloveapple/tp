package com.yx.tp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_class")
public class TeachClass {
    @Id
    private String id;

    /**
     * 教学班ID
     */
    @Column(name = "class_id")
    private String classId;

    /**
     * 教学班名
     */
    @Column(name = "class_name")
    private String className;

    /**
     * 教学班人数
     */
    @Column(name = "class_user_num")
    private Integer classUserNum;

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
     * 获取教学班ID
     *
     * @return class_id - 教学班ID
     */
    public String getClassId() {
        return classId;
    }

    /**
     * 设置教学班ID
     *
     * @param classId 教学班ID
     */
    public void setClassId(String classId) {
        this.classId = classId;
    }

    /**
     * 获取教学班名
     *
     * @return class_name - 教学班名
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置教学班名
     *
     * @param className 教学班名
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取教学班人数
     *
     * @return class_user_num - 教学班人数
     */
    public Integer getClassUserNum() {
        return classUserNum;
    }

    /**
     * 设置教学班人数
     *
     * @param classUserNum 教学班人数
     */
    public void setClassUserNum(Integer classUserNum) {
        this.classUserNum = classUserNum;
    }
}