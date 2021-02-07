package com.github.chengwei710.ideaclassexport.services

import com.github.chengwei710.ideaclassexport.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
