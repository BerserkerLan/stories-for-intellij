package com.github.berserkerlan.storiesforintellij.services

import com.intellij.openapi.project.Project
import com.github.berserkerlan.storiesforintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
