package com.luck.cow.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.luck.cow.entity.DiaryMain;


/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangliang
 * @since 2021-07-07
 */
public interface IDiaryMainService extends IService<DiaryMain> {

    Boolean addDiaryMain(DiaryMain diaryMain);

}
