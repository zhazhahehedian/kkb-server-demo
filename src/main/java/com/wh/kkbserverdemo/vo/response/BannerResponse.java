package com.wh.kkbserverdemo.vo.response;

import lombok.Data;

/**
 * ClassName:BannerResponse
 * Package:com.wh.kkbserverdemo.vo.response
 * Description:
 *
 * @date:2021/12/21 14:33
 * @author:WH
 */
@Data
public class BannerResponse {
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
}
