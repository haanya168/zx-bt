package com.zx.bt.spider.enums;

import com.zx.bt.common.enums.CodeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * author:ZhengXing
 * datetime:2018-03-06 23:01
 * metadata实体 type 字段
 */
@Getter
@AllArgsConstructor
public enum MetadataTypeEnum implements CodeEnum<Integer> {

    PEER(0, "从peer处获取"),
    CILIBA(3, "从https://www.ciliba.org获取"),
//    BTCERISE(4,"从http://www.btcerise.me获取"),
//    BTRABBIT(5, "从http://www.btrabbit.net获取"),
//    NANRENCILI(6, "从http://nanrencili.net获取"),

    ;
    private Integer code;
    private String message;
}
