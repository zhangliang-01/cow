package com.luck.cow.service.impl;



import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.BeanUtils;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.luck.cow.dto.DiaryMainDTO;
import com.luck.cow.entity.DiaryMain;
import com.luck.cow.mapper.DiaryMainMapper;
import com.luck.cow.param.DiaryPageParam;
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

    @Override
    public Page<DiaryMainDTO> getPage(DiaryPageParam param, Integer count, Integer size) {

        LambdaQueryWrapper<DiaryMain> wrapper = Wrappers.<DiaryMain>lambdaQuery();
        Page<DiaryMainDTO> diaryMainDTOPage = new Page<>(count,size);
        Page page = page(new Page(count, size), wrapper);
        for (Object record : page.getRecords()) {
            diaryMainDTOPage.getRecords().add(BeanUtil.copyProperties(record, DiaryMainDTO.class));
        }

        return diaryMainDTOPage;
    }
}
