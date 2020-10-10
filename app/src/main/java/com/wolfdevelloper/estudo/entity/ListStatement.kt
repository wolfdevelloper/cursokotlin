package com.wolfdevelloper.estudo.entity

data class ListStatement(
    var statementList: MutableList<Statement> = ArrayList(),
    var error: Error = Error()
)