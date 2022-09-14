package com.huike.review.mapper;

import com.huike.review.pojo.Review;
import com.huike.review.vo.MybatisReviewVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Mybatis复习的Mapper层
 */
public interface MybatisReviewMapper {


    /**======================================================新增======================================================**/

    /**
     * 通过简单参数的方式保存对象的方法
     * @param name
     * @param age
     * @param sex
     * @return
     */
    int saveData(@Param("name") String name,@Param("age") String age,@Param("sex") String sex);

    /**
     *
     * @param data
     * @return
     */
    int saveDataByPojo(Review data);
    /**======================================================删除======================================================**/

    /**
     *
     * @param id
     * @return
     */
    int remove(Long id);
    /**======================================================修改======================================================**/

    /**
     * 修改接口：
     * @param review
     * @return
     */
    int update(Review review);
    /**======================================================简单查询===================================================**/

    /**
     * 根据id查询对应的数据
     * @param id
     * @return
     */
    Review getById(@Param("id") Long id);

    /**
     * 分页查询数据的方法
     * @return
     */
    List<Review> getDataByPage();
}
