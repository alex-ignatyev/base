import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

private const val DATE_PATTERN = "yyyy.MM.dd"

object AppConfig {
    const val compileSdk = 32
    const val minSdk = 29
    const val targetSdk = 32
    const val versionCode = 1
    const val versionName = "1.0"
    const val buildToolsVersion = "30.0.2"
    const val androidTestInstrumentation = "androidx.test.runner.AndroidJUnitRunner"
    const val proguardConsumerRules = "consumer-rules.pro"

    const val applicationId = "com.aignatyev.base"
    const val javaVersion = "11"
    const val appName = "Base"
}

fun createAppName(suffix: String) = "${AppConfig.appName}$suffix"

fun createFileName(variantName: String, versionName: String, versionCode: Int): String {
    val dateFormat = DateTimeFormatter.ofPattern(DATE_PATTERN)
    val today = dateFormat.format(LocalDateTime.now())
    return "${AppConfig.appName}_${today}_v$versionName($versionCode)_$variantName.apk"
}
