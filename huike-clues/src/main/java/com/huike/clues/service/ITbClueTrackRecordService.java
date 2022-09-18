package com.huike.clues.service;


import com.huike.clues.domain.TbClue;
import com.huike.clues.domain.TbClueTrackRecord;
import com.huike.clues.domain.vo.ClueTrackRecordVo;

import java.util.List;

/**
 * 线索跟进记录Service接口
 * 
 * @author WGL
 * @date 2022-04-19
 */
public interface ITbClueTrackRecordService {

    /**
     * 跟进线索id查询线索跟进记录
     * @param clueId
     * @return
     */
    public List<TbClueTrackRecord> selectTbClueTrackRecordList(Long clueId);

    /**
     * 添加线索跟进记录
     * @param tbClueTrackRecord
     * @return
     */
    int insertTbClueTrackRecord(ClueTrackRecordVo tbClueTrackRecord);

}
