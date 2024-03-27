pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven{ setUrl( "https://maven.aliyun.com/nexus/content/repositories/google'")}
        maven{ setUrl( "https://maven.aliyun.com/nexus/content/groups/public/")}
        maven{ setUrl( "https://maven.aliyun.com/nexus/content/repositories/jcenter")}
        maven{ setUrl( "https://jitpack.io")}
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven{ setUrl( "https://maven.aliyun.com/nexus/content/repositories/google'")}
        maven{ setUrl( "https://maven.aliyun.com/nexus/content/groups/public/")}
        maven{ setUrl( "https://maven.aliyun.com/nexus/content/repositories/jcenter")}
        maven{ setUrl( "https://jitpack.io")}
    }
    versionCatalogs {
        create("projectConfig") {
            from(files("./project.versions.toml"))
        }
        create("libs") {
            from(files("./libs.versions.toml"))
        }
    }
}

rootProject.name = "Compose-widgets"
include(":app")
 