package com.huike.report.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.huike.clues.domain.vo.IndexStatisticsVo;

/**
 * 首页统计分析的Mapper
 * @author Administrator
 *
 */
public interface ReportMapper {
	/**=========================================基本数据========================================*/
	/**
	 * 获取线索数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getCluesNum(@Param("startTime") String beginCreateTime,
						@Param("endTime") String endCreateTime,
						@Param("username") String username);



	/**
	 * 获取商机数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getBusinessNum(@Param("startTime") String beginCreateTime,
						   @Param("endTime") String endCreateTime,
						   @Param("username") String username);



	/**
	 * 获取合同数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getContractNum(@Param("startTime") String beginCreateTime,
						   @Param("endTime") String endCreateTime,
						   @Param("username") String username);




	/**
	 * 获取合同金额
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Double getSalesAmount(@Param("startTime") String beginCreateTime,
						  @Param("endTime") String endCreateTime,
						  @Param("username") String username);

	/**=========================================今日简报========================================*/

	/**
	 * 获取今日新增线索
	 * @param now        今日时间
	 * @param username    用户名
	 * @return
	 */
	Integer getTodayCluesNum(@Param("now") String now,@Param("username") String username);

	/**
	 * 获取今日新增线索
	 * @param now        今日时间
	 * @param username    用户名
	 * @return
	 */
	Integer getTodayBusinessNum(@Param("now") String now,@Param("username") String username);

	/**
	 * 获取今日合同数量
	 * @param now        今日时间
	 * @param username    用户名
	 * @return
	 */
	Integer getTodayContractNum(@Param("now") String now,@Param("username") String username);

	/**
	 * 获取今日合同金额
	 * @param now        今日时间
	 * @param username    用户名
	 * @return
	 */
	Double getTodaySalesAmount(@Param("now") String now,@Param("username") String username);

	/**=========================================待办========================================*/

	/**
	 * 获取待跟进线索数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getTofollowedCluesNum(@Param("startTime") String beginCreateTime,
						@Param("endTime") String endCreateTime,
						@Param("username") String username);



	/**
	 * 获取待跟进商机数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getTofollowedBusinessNum(@Param("startTime") String beginCreateTime,
						   @Param("endTime") String endCreateTime,
						   @Param("username") String username);



	/**
	 * 获取待分配线索数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getToallocatedCluesNum(@Param("startTime") String beginCreateTime,
						   @Param("endTime") String endCreateTime,
						   @Param("username") String username);




	/**
	 * 获取待分配商机数量
	 * @param beginCreateTime	开始时间
	 * @param endCreateTime		结束时间
	 * @param username			用户名
	 * @return
	 */
	Integer getToallocatedBusinessNum(@Param("startTime") String beginCreateTime,
						  @Param("endTime") String endCreateTime,
						  @Param("username") String username);
}
