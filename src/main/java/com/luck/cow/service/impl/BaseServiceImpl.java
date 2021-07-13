package com.luck.cow.service.impl;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.luck.cow.dto.DiaryMainDTO;
import com.luck.cow.entity.DiaryMain;
import com.luck.cow.param.DiaryMainParam;
import com.luck.cow.param.DiaryPageParam;
import com.luck.cow.service.BaseService;
import com.luck.cow.service.IDiaryMainService;
import org.thymeleaf.util.DateUtils;


import javax.annotation.Resource;

/**
 * @author qinzx
 * @date 2021/07/07 16:41
 * @Copyright (C) 杭州同基汽车科技有限公司
 */
public class BaseServiceImpl implements BaseService {
@Resource
    IDiaryMainService iDiaryMainService;

    @Override
    public Boolean addDiary(DiaryMainParam param) {

        DiaryMain diaryMain = new DiaryMain();

        diaryMain.setClosingPrice(param.getClosingPrice());
        diaryMain.setExpectBuyPrice(param.getExpectBuyPrice());
        diaryMain.setBuyPrice(param.getBuyPrice());
        diaryMain.setExpectSellPrice(param.getExpectSellPrice());
        diaryMain.setSellPrice(param.getSellPrice());
        diaryMain.setType(0);
        diaryMain.setCreateDate(DateUtil.date());
//        diaryMain.setBuyDate();
//        diaryMain.setSellDate();
        diaryMain.setCode(param.getCode());
        diaryMain.setCodeName(param.getCodeName());
        diaryMain.setUserId(1L);




        return iDiaryMainService.addDiaryMain(diaryMain);
    }

    @Override
    public Page<DiaryMainDTO> getPage(DiaryPageParam param, Integer count, Integer size) {
        return iDiaryMainService.getPage(param,count,size);
    }
}