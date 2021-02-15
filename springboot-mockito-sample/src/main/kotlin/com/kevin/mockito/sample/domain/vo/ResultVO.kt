package com.kevin.mockito.sample.domain.vo

import com.kevin.mockito.sample.common.consts.BizCodeEnum

/**
 * 基本返回雷
 * @author wangyong
 */
class ResultVO<T> {

    var code: String? = null
    var message: String? = null
    var data: T? = null


    constructor() {}

    constructor(code: String, message: String) {
        this.code = code
        this.message = message
    }

    constructor(bizCode: BizCodeEnum) {
        this.code = bizCode.code
        this.message = bizCode.message
    }

    override fun toString(): String {
        return "ResultVO(code=$code, message=$message, data=$data)"
    }


}