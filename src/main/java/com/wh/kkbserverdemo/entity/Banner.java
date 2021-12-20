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
    //编号
    private Integer BannerId;
    //标题
    private String title;
    //描述
    private String Description;
    //封面
    private String Image;
    //跳转地址
    private String Url;
    //状态;0=上架 1=下架 2=删除
    private Integer Status;
    //顺序;越小越靠前
    private Integer Sort;
    //创建人
    private String CreatedBy;
    //创建时间
    private Date CreateTime;
    //更新人
    private String UpdateBy;
    //更新时间
    private Date UpdateTime;
}
