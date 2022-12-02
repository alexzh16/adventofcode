plugins {
    id("java")
}

group = "eu.ajatex"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks {
    sourceSets {
        main {
            java.srcDirs("src")
        }
    }
}

dependencies {
}
