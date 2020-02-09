package com.baerwang.wuhanjiayou.bean;

import java.util.List;

/**
 * @author baerwang
 * @date 2020/2/9 21:47
 */
public class ChinaDataLevel2 {
    private String author;
    private Object date;
    private Integer suspect;
    private Integer death;
    private Integer cured;
    private Integer serious;
    private Integer diagnosedIncr;
    private Integer suspectIncr;
    private Integer deathIncr;
    private Integer curedIncr;
    private Integer seriousIncr;

    private List<String> list;

    private List<History> history;

    private List<Area> area;

    public ChinaDataLevel2() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Integer getSuspect() {
        return suspect;
    }

    public void setSuspect(Integer suspect) {
        this.suspect = suspect;
    }

    public Integer getDeath() {
        return death;
    }

    public void setDeath(Integer death) {
        this.death = death;
    }

    public Integer getCured() {
        return cured;
    }

    public void setCured(Integer cured) {
        this.cured = cured;
    }

    public Integer getSerious() {
        return serious;
    }

    public void setSerious(Integer serious) {
        this.serious = serious;
    }

    public Integer getDiagnosedIncr() {
        return diagnosedIncr;
    }

    public void setDiagnosedIncr(Integer diagnosedIncr) {
        this.diagnosedIncr = diagnosedIncr;
    }

    public Integer getSuspectIncr() {
        return suspectIncr;
    }

    public void setSuspectIncr(Integer suspectIncr) {
        this.suspectIncr = suspectIncr;
    }

    public Integer getDeathIncr() {
        return deathIncr;
    }

    public void setDeathIncr(Integer deathIncr) {
        this.deathIncr = deathIncr;
    }

    public Integer getCuredIncr() {
        return curedIncr;
    }

    public void setCuredIncr(Integer curedIncr) {
        this.curedIncr = curedIncr;
    }

    public Integer getSeriousIncr() {
        return seriousIncr;
    }

    public void setSeriousIncr(Integer seriousIncr) {
        this.seriousIncr = seriousIncr;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public List<History> getHistory() {
        return history;
    }

    public void setHistory(List<History> history) {
        this.history = history;
    }

    public List<Area> getArea() {
        return area;
    }

    public void setArea(List<Area> area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "ChinaDataLevel2{" +
                "author='" + author + '\'' +
                ", date=" + date +
                ", suspect=" + suspect +
                ", death=" + death +
                ", cured=" + cured +
                ", serious=" + serious +
                ", diagnosedIncr=" + diagnosedIncr +
                ", suspectIncr=" + suspectIncr +
                ", deathIncr=" + deathIncr +
                ", curedIncr=" + curedIncr +
                ", seriousIncr=" + seriousIncr +
                ", list=" + list +
                ", history=" + history +
                ", area=" + area +
                '}';
    }
}
