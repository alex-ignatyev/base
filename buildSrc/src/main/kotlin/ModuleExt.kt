import com.android.build.gradle.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.logging.LogLevel
import org.gradle.api.tasks.compile.JavaCompile
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun Project.applyAndroid(
    useViewBinding: Boolean = false,
    generateBuildConfig: Boolean = false
) {
    extensions.findByType<LibraryExtension>()?.apply {
        compileSdk = AppConfig.compileSdkVersion
        buildToolsVersion = AppConfig.buildToolVersion

        defaultConfig {
            targetSdk = AppConfig.targetSdkVersion
            minSdk = AppConfig.minSdkVersion

            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
            testInstrumentationRunnerArguments += mapOf(
                "runnerBuilder" to "true",
                "de.mannodermaus.junit5.AndroidJUnit5Builder" to "true",
            )
        }

        buildTypes {
            release {
                manifestPlaceholders += mapOf("SCREEN_ORIENTATION" to "portrait")
            }
            create("qa") {
                manifestPlaceholders += mapOf("SCREEN_ORIENTATION" to "portrait")
            }
            debug {
                manifestPlaceholders += mapOf("SCREEN_ORIENTATION" to "unspecified")
            }
        }

        buildFeatures {
            viewBinding = useViewBinding
            buildConfig = generateBuildConfig
        }

        lint {
            isCheckReleaseBuilds = false
            isAbortOnError = false
            isIgnoreWarnings = true
            isQuiet = true
        }

        packagingOptions {
            resources.excludes.addAll(
                setOf("META-INF/*")
            )
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_11
            targetCompatibility = JavaVersion.VERSION_11
        }
    }

    dependencies {
        add("implementation", Dependencies.kotlinStdLib)
    }
}
