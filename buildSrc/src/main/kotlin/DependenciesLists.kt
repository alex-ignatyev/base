import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.hilt() {
    implementation(Dependencies.hiltAndroid)
    implementation(Dependencies.hiltAndroidXCompiler)
    kapt(Dependencies.hiltAndroidCompiler)
}

fun DependencyHandlerScope.retrofit() {
    implementation(Dependencies.retrofit)
    implementation(Dependencies.httpLoggingInterceptor)
}

fun DependencyHandlerScope.modo() {
    implementation(Dependencies.modo)
    implementation(Dependencies.modoRenderAndroidFm)
    kapt(Dependencies.hiltAndroidCompiler)
}

fun DependencyHandlerScope.moshi() {
    implementation(Dependencies.moshi)
    implementation(Dependencies.hiltAndroidXCompiler)
    kapt(Dependencies.moshiKapt)
}

fun DependencyHandlerScope.glide() {
    implementation(Dependencies.glide)
    kapt(Dependencies.glideCompiler)
}

fun DependencyHandlerScope.mviKotlin() {
    implementation(Dependencies.mviKotlinCore)
    implementation(Dependencies.mviKotlinMain)
    implementation(Dependencies.mviKotlinLogging)
    implementation(Dependencies.mviKotlinTimeTravel)
    implementation(Dependencies.mviKotlinExtensionsCoroutines)
    implementation(Dependencies.mviKotlinExtensionsReaktive)
    implementation(Dependencies.mviKotlinRxCore)
    implementation(Dependencies.mviKotlinRxInternal)
    implementation(Dependencies.mviKotlinUtilsInternal)
}

private fun DependencyHandlerScope.implementation(name: String) {
    add("implementation", name)
}

private fun DependencyHandlerScope.kapt(name: String) {
    add("kapt", name)
}
