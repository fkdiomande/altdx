package com.github.fkdiomande.altdx.services

import com.github.fkdiomande.altdx.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
