package com.luck.cow.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luck.cow.entity.DiaryMain;
import com.luck.cow.mapper.DiaryMainMapper;
import com.luck.cow.service.IDiaryMainService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangliang
 * @since 2021-07-07
 */
@Service("iDiaryMainService")
public class DiaryMainServiceImpl extends ServiceImpl<DiaryMainMapper, DiaryMain> implements IDiaryMainService {

    @Override
    public Boolean addDiaryMain(DiaryMain diaryMain) {
        return saveOrUpdate(diaryMain);
    }
}
