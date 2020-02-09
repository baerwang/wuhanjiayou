package com.baerwang.wuhanjiayou.bean;

import java.util.List;

/**
 * @author baerwang
 * @date 2020/2/9 21:51
 */
public class Area {
    private String provinceName;
    private String provinceShortName;
    private Integer confirmedCount;
    private Integer suspectedCount;
    private Integer curedCount;
    private Integer deadCount;
    private String comment;
    private Integer locationId;

    private List<Cities> cities;

    private String preProvinceName;

    private YesterdayIncreased yesterdayIncreased;

    public Area() {
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceShortName() {
        return provinceShortName;
    }

    public void setProvinceShortName(String provinceShortName) {
        this.provinceShortName = provinceShortName;
    }

    public Integer getConfirmedCount() {
        return confirmedCount;
    }

    public void setConfirmedCount(Integer confirmedCount) {
        this.confirmedCount = confirmedCount;
    }

    public Integer getSuspectedCount() {
        return suspectedCount;
    }

    public void setSuspectedCount(Integer suspectedCount) {
        this.suspectedCount = suspectedCount;
    }

    public Integer getCuredCount() {
        return curedCount;
    }

    public void setCuredCount(Integer curedCount) {
        this.curedCount = curedCount;
    }

    public Integer getDeadCount() {
        return deadCount;
    }

    public void setDeadCount(Integer deadCount) {
        this.deadCount = deadCount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public List<Cities> getCities() {
        return cities;
    }

    public void setCities(List<Cities> cities) {
        this.cities = cities;
    }

    public String getPreProvinceName() {
        return preProvinceName;
    }

    public void setPreProvinceName(String preProvinceName) {
        this.preProvinceName = preProvinceName;
    }

    public YesterdayIncreased getYesterdayIncreased() {
        return yesterdayIncreased;
    }

    public void setYesterdayIncreased(YesterdayIncreased yesterdayIncreased) {
        this.yesterdayIncreased = yesterdayIncreased;
    }

    @Override
    public String toString() {
        return "Area{" +
                "provinceName='" + provinceName + '\'' +
                ", provinceShortName='" + provinceShortName + '\'' +
                ", confirmedCount=" + confirmedCount +
                ", suspectedCount=" + suspectedCount +
                ", curedCount=" + curedCount +
                ", deadCount=" + deadCount +
                ", comment='" + comment + '\'' +
                ", locationId=" + locationId +
                ", cities=" + cities +
                ", preProvinceName='" + preProvinceName + '\'' +
                ", yesterdayIncreased=" + yesterdayIncreased +
                '}';
    }
}
