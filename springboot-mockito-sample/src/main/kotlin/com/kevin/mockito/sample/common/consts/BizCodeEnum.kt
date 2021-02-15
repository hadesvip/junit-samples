package com.kevin.mockito.sample.common.consts

enum class BizCodeEnum(code: String, message: String) {

    /**
     * 处理成功
     */
    SUCCESS("200", "处理成功");

    var code: String? = code

    var message: String? = message


}