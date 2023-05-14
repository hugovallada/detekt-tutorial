plugins {
    kotlin("jvm") version "1.8.0"
    id("io.gitlab.arturbosch.detekt").version("1.23.0-RC3")
}

group = "com.github.hugovallada"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}



tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}