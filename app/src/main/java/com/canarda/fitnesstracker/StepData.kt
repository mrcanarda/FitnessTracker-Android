package com.canarda.fitnesstracker

data class StepData(
    val steps: Int = 0,
    val distance: Double = 0.0,
    val duration: Long = 0L,
    val calories: Int = 0,
    val date: Long = System.currentTimeMillis()
)
