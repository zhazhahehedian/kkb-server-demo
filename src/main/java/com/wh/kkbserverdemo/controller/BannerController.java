package com.wh.kkbserverdemo.controller;

import com.wh.kkbserverdemo.entity.Result;
import com.wh.kkbserverdemo.service.BannerService;
import com.wh.kkbserverdemo.vo.request.BannerRequest;
import com.wh.kkbserverdemo.vo.response.BannerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:BannerController
 * Package:com.wh.kkbserverdemo.controller
 * Description:
 *
 * @date:2021/12/21 18:00
 * @author:WH
 */
@RestController
@RequestMapping("/Banner")
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @RequestMapping("/qryList")
    public Result<?> qryList(){
        return Result.success(bannerService.qryList());
    }

    @RequestMapping("/qryListByPage")
    public Result<?> qryListByPage(BannerRequest bannerRequest){
        return null;
    }
}
