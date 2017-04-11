package ru.croc.spring.ui.sample

import mu.KotlinLogging
import org.springframework.stereotype.Component

@Component
class MainService {
    private val logger = KotlinLogging.logger {  }

    fun doJob(path: String) {
        logger.info { "Job has started!" }
        Thread.sleep(100)
        logger.info { "Job is done!" }
    }
}