package com.github.xiaoyuzhzh.ideadocplugin.services

import com.intellij.openapi.project.Project
import com.github.xiaoyuzhzh.ideadocplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
