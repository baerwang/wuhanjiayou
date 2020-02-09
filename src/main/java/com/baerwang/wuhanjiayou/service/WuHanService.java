package com.baerwang.wuhanjiayou.service;

import com.baerwang.wuhanjiayou.bean.ChinaCities;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author baerwang
 * @date 2020/2/9 20:52
 */
@Service
public interface WuHanService {

    List<ChinaCities> provinceInfo(String provinceName);
}
