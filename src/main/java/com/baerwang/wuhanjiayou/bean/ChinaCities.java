package com.baerwang.wuhanjiayou.bean;

import java.util.List;

/**
 * @author baerwang
 * @date 2020/2/9 22:21
 */
public class ChinaCities {
    private String object;

    private Area area;

    private List<Cities> cities;


    public ChinaCities() {
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Cities> getCities() {
        return cities;
    }

    public void setCities(List<Cities> cities) {
        this.cities = cities;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
}
