package com.luck.cow.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.luck.cow.dto.DiaryMainDTO;
import com.luck.cow.entity.DiaryMain;
import com.luck.cow.param.DiaryMainParam;
import com.luck.cow.param.DiaryPageParam;

/**
 * @author qinzx
 * @date 2021/07/07 16:40
 * @Copyright (C) 杭州同基汽车科技有限公司
 */
public interface BaseService {

    Boolean addDiary(DiaryMainParam param);

    Page<DiaryMainDTO> getPage(DiaryPageParam param, Integer count, Integer size);
}