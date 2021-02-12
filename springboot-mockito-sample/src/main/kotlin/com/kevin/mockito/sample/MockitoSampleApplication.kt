package com.kevin.mockito.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 *  应用入口
 * @author wangyong
 */
@SpringBootApplication
open class MockitoSampleApplication

fun main(args: Array<String>) {
    runApplication<MockitoSampleApplication>(*args)
}
