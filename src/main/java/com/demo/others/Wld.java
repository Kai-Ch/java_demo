package com.demo.others;

public enum Wld {

    SUV_ER_OP("20160", "SUV机舱分装线-机舱下件口"),
    SUV_FF_OP("20180", "SUV前地板分装线-前地板下件口"),
    SUV_BF_OP("20200", "SUV后地板分装线-后地板下件口"),
    SUV_SL_OP("20220", "SUV左侧围分装线-左侧围下件口"),
    SUV_SR_OP("20240", "SUV右侧围分装线-右侧围下件口"),
    SUV_MB_UP_AP("20000", "SUV主线-上线点（机舱）"),
    SUV_MB_ER_AP("20010", "SUV主线-机舱合装点"),
    SUV_MB_BF_AP("20020", "SUV主线-后地板合装点"),
    SUV_MB_FF_AP("20030", "SUV主线-前地板合装点"),
    SUVMB_DKJ("20040", "SUV主线-机器人打刻机"),
    SUVMB_MODEL("2005X", "SUV主线-左右侧围获取车型点(主线)"),
    SUVMB_YCW("20050", "SUV主线-右侧围合装点"),
    SUVMB_ZCW("20060", "SUV主线-左侧围合装点"),
    MPV_ER_OP("21160", "MPV机舱分装线-机舱下件口"),
    MPV_FF_OP("21180", "MPV前地板分装线-前地板下件口"),
    MPV_BF_OP("21200", "MPV后地板分装线-后地板下件口"),
    MPV_SL_OP("21220", "SUV左侧围分装线-左侧围下件口"),
    MPV_SR_OP("21240", "SUV右侧围分装线-右侧围下件口"),
    SUV_TZXSX("20090", "SUV-调整线上线点"),
    SUV_TZXXX("20110", "SUV-调整线下线点"),
    MPV_TZXSX("21090", "MPV-调整线上线点"),
    MPV_TZXXX("21110", "MPV-调整线下线点"),

    SUV_WBS_RC("20120", "SUV-调整线至WBS区换载具点"),
    WBS_ENTER("20130", "WBS区入口"),
    WBS_EXPORT("20140", "WBS区出口");

    private final String value;

    private final String desc;

    Wld(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }


    public boolean equals(Wld wld) {
        return this.value().equals(wld.value());
    }

    public boolean equals(String wld) {
        return this.value().equals(wld);
    }

    public String value() {
        return this.value;
    }

    public String getDesc() {
        return this.desc;
    }

    public static Wld resolve(String optCode) {
        for (Wld status : values()) {
            if (status.value.equals(optCode)) {
                return status;
            }
        }
        return null;
    }
}
