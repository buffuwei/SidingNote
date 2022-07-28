package com.github.buffuwei.sidingnote.services

import com.intellij.openapi.project.Project
import com.github.buffuwei.sidingnote.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
