package com.wh.kkbserverdemo.service;

import com.wh.kkbserverdemo.entity.Banner;
import com.wh.kkbserverdemo.entity.page.PageResult;
import com.wh.kkbserverdemo.vo.request.BannerRequest;
import com.wh.kkbserverdemo.vo.response.BannerResponse;

import java.util.List;

/**
 * ClassName:BannerService
 * Package:com.wh.kkbserverdemo.service
 * Description:
 *
 * @date:2021/12/21 16:33
 * @author:WH
 */
public interface BannerService {
    /**
     * 查询Banner列表
     * @return BannerResponse
     */
    List<BannerResponse> qryList();

    /**
     * 分页查询
     * @param bannerRequest
     * @return BannerResponse
     */
    PageResult qryListByPage(BannerRequest bannerRequest);

    /**
     * 根据id查询Banner视图参数
     * @param id
     * @return BannerResponse
     */
    BannerResponse findById(Integer id);

    /**
     * 插入Banner数据
     * @param banner
     * @return 成功返回1 失败返回0
     */
    int insertBanner(Banner banner);

    /**
     * 根据id删除Banner数据
     * @param id
     * @return 成功返回1 失败返回0
     */
    int deleteById(Integer id);

    /**
     * 更新Banner视图数据
     * @param bannerResponse
     * @return 成功返回1 失败返回0
     */
    int updateBanner(BannerResponse bannerResponse);
}
