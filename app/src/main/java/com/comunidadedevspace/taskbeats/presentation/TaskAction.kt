package com.comunidadedevspace.taskbeats.presentation

import com.comunidadedevspace.taskbeats.data.Task
import java.io.Serializable


data class TaskAction(
    val task: Task?,
    val actionType: String
) : Serializable

enum class ActionType {

    DELETE,
    UPDATE,
    CREATE
}