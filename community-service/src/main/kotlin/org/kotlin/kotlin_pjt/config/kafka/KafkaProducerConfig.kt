package org.kotlin.kotlin_pjt.config.kafka

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class KafkaProducerConfig {

    @Value("\${spring.kafka.bootstrap-servers}")
    private val bootstrapServers: String = "" // 기본값 제공

}