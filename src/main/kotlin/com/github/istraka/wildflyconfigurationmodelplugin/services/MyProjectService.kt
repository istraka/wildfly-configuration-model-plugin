package com.github.istraka.wildflyconfigurationmodelplugin.services

import com.intellij.openapi.project.Project
import com.github.istraka.wildflyconfigurationmodelplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
