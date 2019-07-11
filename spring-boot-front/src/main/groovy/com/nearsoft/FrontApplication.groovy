package com.nearsoft

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.solr.SolrAutoConfiguration

/**
 * This is the main class of the project
 */

@SpringBootApplication( scanBasePackages = ['com.nearsoft'], exclude = [SolrAutoConfiguration])
class FrontApplication {

    static void main(String[] args) {
        SpringApplication.run(FrontApplication.class, args);
    }

}
