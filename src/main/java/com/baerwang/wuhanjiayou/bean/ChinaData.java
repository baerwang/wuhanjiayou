package com.baerwang.wuhanjiayou.bean;

/**
 * @author baerwang
 * @date 2020/2/9 21:08
 */
public class ChinaData {
    private Integer errCode = 0;

    private ChinaDataLevel2 data;

    public ChinaData() {
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public ChinaDataLevel2 getData() {
        return data;
    }

    public void setData(ChinaDataLevel2 data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ChinaData{" +
                "errCode=" + errCode +
                ", data=" + data +
                '}';
    }
}
