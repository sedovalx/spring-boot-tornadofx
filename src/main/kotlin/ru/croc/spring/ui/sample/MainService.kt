package ru.croc.spring.ui.sample

import mu.KotlinLogging
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class MainService {
    private val logger = KotlinLogging.logger {  }

    @Autowired
    private lateinit var pdfService: PdfService

    fun doJob(path: String) {
        logger.info { "Job has started!" }
        pdfService.buildPdf("c://pdf")
        Thread.sleep(100)
        logger.info { "Job is done!" }
    }
}