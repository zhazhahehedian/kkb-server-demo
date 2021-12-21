package com.wh.kkbserverdemo.vo.request;

import com.wh.kkbserverdemo.entity.page.PageRequest;
import lombok.Data;

/**
 * ClassName:BannerRequest
 * Package:com.wh.kkbserverdemo.vo.request
 * Description:
 *
 * @date:2021/12/21 14:33
 * @author:WH
 */
@Data
public class BannerRequest extends PageRequest {
    /**
     * 标题
     */
    private String title;
}
