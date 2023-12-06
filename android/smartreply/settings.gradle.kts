pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "mlkit_smart_reply_sample"
include(":app")
include (":internal:chooserx")
project(":internal:chooserx").projectDir = file("../internal/chooserx")