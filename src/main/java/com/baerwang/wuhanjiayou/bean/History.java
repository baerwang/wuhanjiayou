package com.baerwang.wuhanjiayou.bean;

/**
 * @author baerwang
 * @date 2020/2/9 21:49
 */
public class History {

    private String data;
    private Integer confirmedNum;
    private Integer suspectedNum;
    private Integer curesNum;
    private Integer deathsNum;
    private Integer suspectedIncr;

    public History() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getConfirmedNum() {
        return confirmedNum;
    }

    public void setConfirmedNum(Integer confirmedNum) {
        this.confirmedNum = confirmedNum;
    }

    public Integer getSuspectedNum() {
        return suspectedNum;
    }

    public void setSuspectedNum(Integer suspectedNum) {
        this.suspectedNum = suspectedNum;
    }

    public Integer getCuresNum() {
        return curesNum;
    }

    public void setCuresNum(Integer curesNum) {
        this.curesNum = curesNum;
    }

    public Integer getDeathsNum() {
        return deathsNum;
    }

    public void setDeathsNum(Integer deathsNum) {
        this.deathsNum = deathsNum;
    }

    public Integer getSuspectedIncr() {
        return suspectedIncr;
    }

    public void setSuspectedIncr(Integer suspectedIncr) {
        this.suspectedIncr = suspectedIncr;
    }

    @Override
    public String toString() {
        return "History{" +
                "data='" + data + '\'' +
                ", confirmedNum=" + confirmedNum +
                ", suspectedNum=" + suspectedNum +
                ", curesNum=" + curesNum +
                ", deathsNum=" + deathsNum +
                ", suspectedIncr=" + suspectedIncr +
                '}';
    }
}
