// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(projectConfig.plugins.application) apply false
    alias(projectConfig.plugins.kotlin) apply false
    alias(projectConfig.plugins.library) apply false
}
true // Needed to make the Suppress annotation work for the plugins block