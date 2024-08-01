package jp.ac.it_college.std.s23024.intentsample

import kotlinx.serialization.Serializable


@Serializable
data class SetMeal(
    val id: Long,
    val name: String,
    val price: Int,
    val desc: String,
)
