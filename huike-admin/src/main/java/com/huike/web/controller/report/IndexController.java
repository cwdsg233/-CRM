package com.huike.web.controller.report;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.huike.common.core.domain.AjaxResult;
import com.huike.report.service.IReportService;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private IReportService reportService;


    /**
     * 首页--基础数据统计
     * @param beginCreateTime
     * @param endCreateTime
     * @return
     */
    @GetMapping("/getBaseInfo")
    public AjaxResult getBaseInfo(@RequestParam("beginCreateTime") String beginCreateTime,
                                  @RequestParam("endCreateTime") String endCreateTime){
        return AjaxResult.success(reportService.getBaseInfo(beginCreateTime,endCreateTime));
    }

    /**
     * 首页--今日简报
     * @return
     */
    @GetMapping("/getTodayInfo")
    public AjaxResult getTodayInfo(){
        return AjaxResult.success(reportService.getTodayInfo());
    }

    //首页--待办数据统计接口
    @GetMapping("/getTodoInfo")
    public AjaxResult getTodoInfo(@RequestParam("beginCreateTime") String beginCreateTime,
                                  @RequestParam("endCreateTime") String endCreateTime){
        return AjaxResult.success(reportService.getTodoInfo(beginCreateTime,endCreateTime));
    }
}