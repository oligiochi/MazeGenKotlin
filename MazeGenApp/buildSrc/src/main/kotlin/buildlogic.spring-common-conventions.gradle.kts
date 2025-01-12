/*
 * Convenzioni comuni per progetti Spring
*/

plugins {
    id("org.springframework.boot")
    id("io.spring.dependency-management")
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.kotlin.plugin.spring")
    id("org.jetbrains.kotlin.plugin.jpa")
}

dependencies {
    // Dipendenze di Spring Boot
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("com.h2database:h2")

    // Dipendenze di test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}


//implementation("org.springframework.boot:spring-boot-gradle-plugin:${libs.versions.spring-boot.get()}")