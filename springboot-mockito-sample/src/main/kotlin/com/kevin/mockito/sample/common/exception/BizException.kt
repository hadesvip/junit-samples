package com.kevin.mockito.sample.common.exception

import com.kevin.mockito.sample.common.consts.BizCodeEnum
import java.lang.RuntimeException

/**
 * 业务异常
 * @author wangyong
 */
class BizException : RuntimeException {

    var code: String? = null
    override var message: String? = null

    constructor() {

    }

    constructor(bizCode: BizCodeEnum) {
        this.code = bizCode.code
        this.message = bizCode.message
    }

    override fun toString(): String {
        return "BizException(code=${this.code}, message=${this.message})"
    }


}