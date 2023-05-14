plugins {
    kotlin("jvm") version "1.8.0"
    id("io.gitlab.arturbosch.detekt").version("1.23.0-RC3")
}

group = "com.github.hugovallada"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks {
    detekt {
        input = files("src/main/kotlin") // Diretório de origem do código a ser analisado
        reports {
            xml {
                enabled = true // Geração de relatório em formato XML
                destination = file("$buildDir/reports/detekt.xml") // Diretório de destino para o relatório
            }
            html.enabled = false // Desativar geração de relatório HTML (opcional)
        }
    }
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}