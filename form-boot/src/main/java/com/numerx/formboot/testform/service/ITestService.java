package com.numerx.formboot.testform.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.numerx.formboot.testform.entity.Test;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author matrixorz
 * @since 2019-08-13
 */
public interface ITestService extends IService<Test> {

    Page<Map<Object, Object>> selectTestPage(Page<Map<Object, Object>> mapPage, QueryWrapper<Test> queryWrapper);

    IPage<Test> selectTestPage2(Page<Test> page, Integer state);
}
