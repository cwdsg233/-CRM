package com.huike.review.service;

import com.huike.review.pojo.Review;
import com.huike.review.vo.MybatisReviewVO;

import java.util.List;

/**
 * mybatis复习接口层
 */
public interface ReviewService {

    /**
     * 根据传入的参数保存数据的方法
     * @param name
     * @param age
     * @param sex
     * @return
     */
    String saveData(String name, String age, String sex);

    /**
     * 方法重载：方法名相同 传递参数不同
     * @param user 前端传入对象
     * @return
     */
    String saveData(MybatisReviewVO user);

    /**
     *
     * @param id
     * @return
     */
    String remove(Long id);

    /**
     * 修改接口：
     * @param reviewVO
     * @return
     */
    String update(MybatisReviewVO reviewVO);

    /**
     * 根据id获取数据的方法
     * @param id
     * @return
     */
    public Review getDataById(Long id);

    /**
     * 分页查询对应数据的方法
     * @return
     */
    List<Review> getDataByPage();
}
