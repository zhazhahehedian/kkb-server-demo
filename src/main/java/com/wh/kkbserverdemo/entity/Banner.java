package com.wh.kkbserverdemo.entity;

import lombok.Data;

import java.util.Date;

/**
 * ClassName:Banner
 * Package:com.wh.kkbserverdemo.entity
 * Description:
 *
 * @date:2021/12/20 22:54
 * @author:WH
 */
@Data
public class Banner {
    /**
     * 编号
     */
    private Integer bannerId;
    /**
     * 标题
     */
    private String title;
    /**
     * 描述
     */
    private String description;
    /**
     * 封面
     */
    private String image;
    /**
     * 跳转地址
     */
    private String url;
    /**
     * 状态;0=上架 1=下架 2=删除
     */
    private Integer status;
    /**
     * 顺序;越小越靠前
     */
    private Integer sort;
    /**
     * 创建人
     */
    private String createdBy;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 更新人
     */
    private String updatedBy;
    /**
     * 更新时间
     */
    private Date updatedTime;
}
