buildscript {
    repositories {
        google()
        mavenCentral()
        /*maven {
            url = uri("https://plugins.gradle.org/m2/")
        }*/
    }
    dependencies {
        classpath(Dependencies.gradle)
        classpath(Dependencies.gradleKotlin)
        classpath(Dependencies.hilt)
        /*classpath("org.jmailen.gradle:kotlinter-gradle:${Versions.kotlinter}")
        classpath("de.mannodermaus.gradle.plugins:android-junit5:1.8.1.0")
        classpath("com.google.gms:google-services:4.3.10")
        classpath("com.google.firebase:firebase-appdistribution-gradle:3.0.0")*/
    }
}

/*plugins {
    id(Plugins.detekt) version Versions.detekt
    id(Plugins.gradleCacheFix) version Versions.gradleCacheFix apply false
}*/

/*allprojects {
    apply(plugin = Plugins.kotlinter)
    apply(plugin = Plugins.detekt)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://jitpack.io")
        }
    }
}*//*
subprojects {
    plugins.withType<AndroidBasePlugin> {
        apply(plugin = Plugins.gradleCacheFix)
    }
    tasks.withType<KotlinCompile> {
        kotlinOptions.jvmTarget = AppConfig.javaVersion
        kotlinOptions.freeCompilerArgs += listOf("-Xopt-in=kotlin.RequiresOptIn")
    }
}*/

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
/*

detekt {
    config = files("$projectDir/detekt.yml")
}

tasks.withType<Detekt>().configureEach {
    reports {
        html.required.set(true)
    }
    jvmTarget = AppConfig.javaVersion
    parallel = true
}*/
