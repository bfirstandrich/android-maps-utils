/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}


dependencies {
    implementation(libs.kotlin.gradle.plugin)
    implementation(libs.gradle)
    implementation(libs.dokka.gradle.plugin)
    implementation(libs.org.jacoco.core)
    implementation(libs.gradle.maven.publish.plugin)
}

gradlePlugin {
    plugins {
        register("publishingConventionPlugin") {
            id = "android.maps.utils.PublishingConventionPlugin"
            implementationClass = "PublishingConventionPlugin"
        }
    }
}