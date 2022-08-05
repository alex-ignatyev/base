import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.hilt() {
    implementation(Dependencies.hiltAndroid)
    implementation(Dependencies.hiltAndroidXCompilerKapt)
    kapt(Dependencies.hiltAndroidCompilerKapt)
}

fun DependencyHandlerScope.retrofit() {
    implementation(Dependencies.retrofit)
    implementation(Dependencies.httpLoggingInterceptor)
}

fun DependencyHandlerScope.modo() {
    implementation(Dependencies.modo)
    implementation(Dependencies.modoRenderAndroidFm)
    kapt(Dependencies.hiltAndroidCompilerKapt)
}

fun DependencyHandlerScope.glide() {
    implementation(Dependencies.glide)
    kapt(Dependencies.glideCompiler)
}

private fun DependencyHandlerScope.implementation(name: String) {
    add("implementation", name)
}

private fun DependencyHandlerScope.kapt(name: String) {
    add("kapt", name)
}
