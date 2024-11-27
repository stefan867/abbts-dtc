
plugins {
    kotlin("jvm").version("1.9.21")
    id("org.jetbrains.dokka") version "1.9.10"}

repositories {
    mavenCentral()
}

//sourceSets.main {
//    java.srcDirs("mysrc")
// }
//
tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "MainKt"
    }
}
