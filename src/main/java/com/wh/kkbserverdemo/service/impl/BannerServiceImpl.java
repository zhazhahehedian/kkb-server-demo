package com.wh.kkbserverdemo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wh.kkbserverdemo.entity.Banner;
import com.wh.kkbserverdemo.entity.page.PageResult;
import com.wh.kkbserverdemo.mapper.BannerMapper;
import com.wh.kkbserverdemo.service.BannerService;
import com.wh.kkbserverdemo.utils.PageUtils;
import com.wh.kkbserverdemo.vo.request.BannerRequest;
import com.wh.kkbserverdemo.vo.response.BannerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:BannerServiceImpl
 * Package:com.wh.kkbserverdemo.service.impl
 * Description:
 *
 * @date:2021/12/21 16:34
 * @author:WH
 */
@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public List<BannerResponse> qryList() {
        return bannerMapper.qryList();
    }

    @Override
    public PageResult qryListByPage(BannerRequest bannerRequest) {
        int pageNum = bannerRequest.getPageNum();
        int pageSize = bannerRequest.getPageSize();
        PageHelper.startPage(pageNum,pageSize);
        List<BannerResponse> bannerResponses = bannerMapper.qryListByPage(bannerRequest);
        return PageUtils.getPageResult(new PageInfo<BannerResponse>(bannerResponses));
    }

    @Override
    public BannerResponse findById(Integer id) {
        return bannerMapper.findById(id);
    }

    @Override
    public int insertBanner(Banner banner) {
        int res = bannerMapper.insertBanner(banner);
        return res;
    }

    @Override
    public int deleteById(Integer id) {
        int res = bannerMapper.deleteById(id);
        return res;
    }

    @Override
    public int updateBanner(BannerResponse bannerResponse) {
        int res = bannerMapper.updateBanner(bannerResponse);
        return res;
    }
}
