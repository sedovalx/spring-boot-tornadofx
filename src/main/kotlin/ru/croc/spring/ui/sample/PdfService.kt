package ru.croc.spring.ui.sample

import mu.KotlinLogging
import org.springframework.stereotype.Component

@Component
class PdfService {
    private val logger = KotlinLogging.logger {  }

    fun buildPdf(outputFolder: String) {
        logger.info { "PDF files were saved to $outputFolder" }
    }
}