plugins {
    id("java")
}

group = "com.krepchos"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    compileOnly(files("libs/HytaleServer.jar"))
}

tasks.jar {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE

    from("src/main/resources")
}