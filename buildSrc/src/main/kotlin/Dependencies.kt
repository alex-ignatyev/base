object Dependencies {
    // App
    const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val gradleKotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.gradleKotlin}"
    const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"

    // Kotlin
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"

    // Coroutines
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}"
    const val coroutinesGPServices = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.coroutinesGPServices}"

    // Android
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}" // Необходимо проверить, возможно все включает lifecycle-viewmodel
    const val lifecycleVM = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}" // Необходимо проверить, возможно все включает lifecycle-viewmodel-compose
    const val lifecycleVMCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.lifecycle}"
    const val lifecycleVMSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle}"
    const val lifecycleVMService = "androidx.lifecycle:lifecycle-service:${Versions.lifecycle}"
    const val lifecycleVMSProcess= "androidx.lifecycle:lifecycle-process:${Versions.lifecycle}"
    const val lifecycleVMCompilerKapt = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"
    const val biometry = "androidx.biometric:biometric-ktx:${Versions.biometry}"

    //-----------Выше проверено-----------------

    // Compose

    // Google

    // DI
    const val hiltAndroid = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltAndroidCompilerKapt = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    const val hiltAndroidXCompilerKapt = "androidx.hilt:hilt-compiler:${Versions.hiltAndroidXCompilerKapt}"

    // Remote
    const val okhttp3 = "com.squareup.okhttp3:okhttp:${Versions.okhttp3}" // Возможно уже не нужен и все содержится в ретрофите
    const val httpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3}" // Возможно уже не нужен и все содержится в ретрофите
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val retrofitCoroutines = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutines}" // Возможно уже не нужен

    // DB

    // UI
    const val material = "com.google.android.material:material:${Versions.material}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshLayout}"
    const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
    const val viewPager2 = "androidx.viewpager2:viewpager2:${Versions.viewPager2}"
    const val viewPagerIndicator = "com.github.zhpanvip:viewpagerindicator:${Versions.viewPagerIndicator}"
    const val gravitySnapHelper = "com.github.rubensousa:gravitysnaphelper:${Versions.gravitySnapHelper}"

    // Recycler View
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    const val adapterDelegate = "com.hannesdorfmann:adapterdelegates4-kotlin-dsl-viewbinding:${Versions.adapterDelegate}"
    const val loopingLayout = "com.github.beksomega:loopinglayout:${Versions.loopingLayout}"
    const val paging = "androidx.paging:paging-runtime:${Versions.paging}"

    //Images
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    // Navigation
    const val modo = "com.github.terrakok:modo:${Versions.modo}"
    const val modoRenderAndroidFm = "com.github.terrakok:modo-render-android-fm:${Versions.modo}"

    // Test

    // Other
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    const val preferences = "androidx.preference:preference-ktx:${Versions.preferences}"
    const val splashScreen = "androidx.core:core-splashscreen:${Versions.splashScreen}"
    const val inject = "javax.inject:javax.inject:${Versions.inject}"
    const val spekDsl = "org.spekframework.spek2:spek-dsl-jvm:${Versions.spekVersion}"
    const val spekRunner = "org.spekframework.spek2:spek-runner-junit5:${Versions.spekVersion}"
    const val kotlinReflect = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
    const val assertjCore = "org.assertj:assertj-core:${Versions.assertjCore}"
    const val firebaseBoom = "com.google.firebase:firebase-bom:${Versions.firebaseBoom}"
    const val recurrenceRule = "org.dmfs:lib-recur:${Versions.recurrenceRule}"
    const val pinView = "io.github.chaosleung:pinview:${Versions.pinView}"
    const val pinkmanPincode = "com.redmadrobot:pinkman-ui:${Versions.pinkmanPincode}"
    const val firebaseMessaging = "com.google.firebase:firebase-messaging"
    const val securityCrypto = "androidx.security:security-crypto:${Versions.securityCrypto}"
    const val robotMask = "com.github.RedMadRobot:input-mask-android:${Versions.robotMask}"
}
