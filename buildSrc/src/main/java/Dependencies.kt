/**
 * @author tuozhaobing
 * @Date 2018/12/29
 * @description manage project dependencies
 * @since 1.0.0
 */
object Versions {
    val kotlin = "1.3.11"
    val build_gradle = "3.2.1"

    val compileSdkVersion = 28
    val minSdkVersion = 16
    val targetSdkVersion = 28

    val constraint = "1.1.3"
    val appcompat_v7 = "23.1.1"

    val junit = "4.12"
    val test_runner = "1.0.2"
    val espresso = "3.0.2"
}

object Deps {
    val kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val build_gradle = "com.android.tools.build:gradle:${Versions.build_gradle}"
    val kotlin_stdlib_jdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val constraint = "com.android.support.constraint:constraint-layout:${Versions.constraint}"
    val appcompat_v7 = "com.android.support:appcompat-v7:${Versions.appcompat_v7}"
    val react_native = "com.facebook.react:react-native:+"

    val junit = "junit:junit:${Versions.junit}"
    val test_runner = "com.android.support.test:runner:${Versions.test_runner}"
    val espresso = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
}