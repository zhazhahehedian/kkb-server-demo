package com.wh.kkbserverdemo.entity.page;

import lombok.Data;

/**
 * ClassName:PageRequest
 * Package:com.wh.kkbserverdemo.entity.page
 * Description:
 *
 * @date:2021/12/21 14:35
 * @author:WH
 */
@Data
public class PageRequest {
    /**
     * 当前记页
     */
    private Integer pageNum;

    /**
     * 每页数量
     */
    private Integer pageSize;
}
