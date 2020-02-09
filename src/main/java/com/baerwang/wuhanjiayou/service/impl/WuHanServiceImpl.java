package com.baerwang.wuhanjiayou.service.impl;

import com.alibaba.fastjson.JSON;
import com.baerwang.wuhanjiayou.bean.Area;
import com.baerwang.wuhanjiayou.bean.ChinaCities;
import com.baerwang.wuhanjiayou.bean.ChinaData;
import com.baerwang.wuhanjiayou.common.Province;
import com.baerwang.wuhanjiayou.service.WuHanService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

/**
 * @author baerwang
 * @date 2020/2/9 20:53
 */
@Service
public class WuHanServiceImpl implements WuHanService {


    @Override
    public List<ChinaCities> provinceInfo(String provinceName) {
        ChinaData chinaData = chinaDataApi();
        List<String> list = chinaData.getData().getList();
        List<Area> areaList = chinaData.getData().getArea();
        List<ChinaCities> chinaCitiesList = new ArrayList<>();
        ChinaCities chinaCities = new ChinaCities();
        String infoList = list.get(Province.valueOf(provinceName).getValue());
        chinaCities.setObject(infoList);
        areaList.forEach(area -> {
            if (area.getProvinceName().equals(provinceName)) {
                chinaCities.setArea(area);
                chinaCities.setCities(area.getCities());
                chinaCitiesList.add(chinaCities);
            }
        });
        return chinaCitiesList;
    }

    private ChinaData chinaDataApi() {
        String urls = "https://tianqiapi.com/api?version=epidemic&appid=73327177&appsecret=1nz3IVDc";
        StringBuilder json = new StringBuilder();
        try {
            URL urlObject = new URL(urls);
            URLConnection uc = urlObject.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(uc.getInputStream(), "UTF-8"));
            String inputLine = null;
            while ((inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return JSON.parseObject(json.toString(), ChinaData.class);
    }


}
