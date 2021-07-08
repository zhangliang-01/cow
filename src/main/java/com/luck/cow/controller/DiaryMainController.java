package com.luck.cow.controller;


import com.luck.cow.param.DiaryMainParam;
import com.luck.cow.service.BaseService;
import com.luck.cow.service.IDiaryMainService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangliang
 * @since 2021-07-07
 */
@RestController
@RequestMapping("diary/main")
public class DiaryMainController {

    @Resource
    BaseService baseService;

    @PostMapping("add")
    public Boolean addDiary(@RequestBody DiaryMainParam diaryMainParam){
        return baseService.addDiary(diaryMainParam);
    }


}
