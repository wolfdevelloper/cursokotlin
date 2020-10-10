package com.wolfdevelloper.estudo.viewmodel

import com.wolfdevelloper.estudo.utils.DateTime
import com.wolfdevelloper.estudo.utils.MoneyMask
import com.wolfdevelloper.estudo.entity.Statement

data class Statement(
    var title: String = "",
    var desc: String = "",
    var date: String = "",
    var value: String = ""
) {
    fun mapper(statement: Statement): com.wolfdevelloper.estudo.viewmodel.Statement {

        this.title = statement.title
        this.desc = statement.title
        this.date = DateTime.mask(statement.title)
        this.value = MoneyMask.mask(statement.value)
        return this
    }
}