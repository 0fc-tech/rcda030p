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

rootProject.name = "EniShop"
include(":app")
include(":enishop")
include(":mod3kotlin")
include(":mod4ihm")
include(":mod4databinding")
include(":mod5navcomponent")
