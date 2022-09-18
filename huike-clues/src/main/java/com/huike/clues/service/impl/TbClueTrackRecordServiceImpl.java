package com.huike.clues.service.impl;


import com.huike.clues.domain.TbClue;
import com.huike.clues.domain.TbClueTrackRecord;
import com.huike.clues.domain.vo.ClueTrackRecordVo;
import com.huike.clues.mapper.TbClueMapper;
import com.huike.clues.mapper.TbClueTrackRecordMapper;
import com.huike.clues.service.ITbClueTrackRecordService;
import com.huike.common.utils.DateUtils;
import com.huike.common.utils.SecurityUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 线索跟进记录Service业务层处理
 * @date 2022-04-22
 */
@Service
public class TbClueTrackRecordServiceImpl implements ITbClueTrackRecordService {


    @Autowired
    private TbClueMapper tbClueMapper;

    @Autowired
    private TbClueTrackRecordMapper tbClueTrackRecordMapper;

    /**
     * 跟进线索id查询线索跟进记录
     *
     * @param clueId
     * @return
     */
    @Override
    public List<TbClueTrackRecord> selectTbClueTrackRecordList(Long clueId) {
        return tbClueTrackRecordMapper.selectTbClueTrackRecordListByClueId(clueId);
    }

    /**
     * 添加线索跟进记录
     * @param tbClueTrackRecord
     * @return
     */
    @Override
    @Transactional
    public int insertTbClueTrackRecord(ClueTrackRecordVo tbClueTrackRecord) {
        TbClueTrackRecord trackRecord=new TbClueTrackRecord();//线索跟进记录对象
        BeanUtils.copyProperties(tbClueTrackRecord,trackRecord);
        trackRecord.setCreateTime(DateUtils.getNowDate());//获取当前时间
        trackRecord.setCreateBy(SecurityUtils.getUsername());//获取用户账户名

        TbClue tbClue=new TbClue();//线索管理对象
        BeanUtils.copyProperties(tbClueTrackRecord,tbClue);
        tbClue.setStatus(TbClue.StatusType.FOLLOWING.getValue()); //进行中
        tbClue.setId(tbClueTrackRecord.getClueId());
        tbClueMapper.updateTbClue(tbClue);

        return tbClueTrackRecordMapper.insertTbClueTrackRecord(trackRecord);
    }
}
