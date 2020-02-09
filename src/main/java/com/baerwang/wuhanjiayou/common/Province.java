package com.baerwang.wuhanjiayou.common;

/**
 * @author baerwang
 * @date 2020/2/9 22:53
 */
public enum Province {

    湖北(0),
    广东(1),
    浙江(2),
    河南(3),
    湖南(4),
    安徽(5),
    江西(6),
    江苏(7),
    重庆(8),
    山东(9),
    四川(10),
    北京(11),
    黑龙江(12),
    上海(13),
    福建(14),
    陕西(16),
    河北(16),
    广西(17),
    云南(18),
    海南(19),
    山西(20),
    辽宁(21),
    贵州(22),
    天津(23),
    甘肃(24),
    吉林(25),
    内蒙古(26),
    宁夏(27),
    新疆(28),
    香港(29),
    台湾(30),
    青海(31),
    澳门(32),
    西藏(33);

    private int value;

    Province(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
