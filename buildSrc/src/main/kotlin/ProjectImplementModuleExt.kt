import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project

fun DependencyHandlerScope.mvi() {
    implementationProject(":mvicoroutines")
    implementationProject(":mvi")
}

fun DependencyHandlerScope.core() {
    implementationProject(":core")
}

fun DependencyHandlerScope.coroutines() {
    implementationProject(":coroutines")
}

fun DependencyHandlerScope.uiKit() {
    implementationProject(":uikit")
}

fun DependencyHandlerScope.navigation() {
    implementationProject(":navigation")
}

private fun DependencyHandlerScope.implementationProject(name: String) {
    add("implementation", project(name))
}

fun DependencyHandlerScope.netutils() {
    implementationProject(":netutils")
}
