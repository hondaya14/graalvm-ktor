plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.graalvm.native.buildtools)
    alias(libs.plugins.ktor)
    alias(libs.plugins.kotlin.plugin.serialization)
}

group = "co.hondaya"
version = "0.0.1"

application {
    mainClass = "co.hondaya.ApplicationKt"
}

dependencies {
    implementation(libs.ktor.server.core)
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.ktor.server.content.negotiation)
    implementation(libs.ktor.server.cio)
    implementation(libs.logback.classic)
    implementation(libs.ktor.server.config.yaml)
    testImplementation(libs.ktor.server.test.host)
    testImplementation(libs.kotlin.test.junit)
}

graalvmNative {
    binaries {
        named("main") {
            resources.autodetect()
            buildArgs.addAll(listOf(
                "-H:+ReportExceptionStackTraces",
            ))
        }
    }
}
