rootProject.name = "GSit"

include(":core")
include(":v1_21_4")
project(":v1_21_4").projectDir = file("mcv/v1_21_4")

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.9.0"
}
