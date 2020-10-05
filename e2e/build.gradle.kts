plugins {
    `java-library`
}

dependencies {
    implementation("com.github.cukedoctor:cukedoctor-main")

    testImplementation("{{project_namespace}}:domain:{{project_version}}")
    testImplementation("io.cucumber:cucumber-java")
    testImplementation("io.cucumber:cucumber-junit-platform-engine")
    testImplementation("io.rest-assured:json-path")
    testImplementation("io.rest-assured:rest-assured")
    testImplementation("org.assertj:assertj-core")
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.mockito:mockito-core")
    testImplementation("org.mockito:mockito-junit-jupiter")
}

group = "{{project_namespace}}"
version = "{{project_version}}"

apply { plugin("java") }
apply { plugin("maven-publish") }

repositories {
    jcenter()
    mavenCentral()

    val mavenUser: String by project
    val mavenPassword: String by project
    val snapshotsRepoUrl: String by project
    val releasesRepoUrl: String by project

    repositories {
        maven {
            url = if (version.toString().endsWith("SNAPSHOT")) uri(snapshotsRepoUrl) else uri(releasesRepoUrl)
            credentials {
                username = mavenUser
                password = mavenPassword
            }
        }
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2")
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

val javaRestProjectVersion: String by project

dependencies {
    dependencies {
        implementation(platform("com.paxleones:java-rest-project:$javaRestProjectVersion"))
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}