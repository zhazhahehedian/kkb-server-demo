package com.wh.kkbserverdemo.entity.page;

import lombok.Data;

import java.util.List;

/**
 * ClassName:PageResult
 * Package:com.wh.kkbserverdemo.entity.page
 * Description:
 *
 * @date:2021/12/21 14:35
 * @author:WH
 */
@Data
public class PageResult {
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
    /**
     * 记录总数
     */
    private long totalSize;
    /**
     * 页码总数
     */
    private int totalPages;
    /**
     * 数据模型
     */
    private List<?> content;
}
