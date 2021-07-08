package com.luck.cow.service;

import com.luck.cow.entity.DiaryMain;
import com.luck.cow.param.DiaryMainParam;

/**
 * @author qinzx
 * @date 2021/07/07 16:40
 * @Copyright (C) 杭州同基汽车科技有限公司
 */
public interface BaseService {

    Boolean addDiary(DiaryMainParam param);
}