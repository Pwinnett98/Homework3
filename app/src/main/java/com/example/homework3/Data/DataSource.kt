package com.example.homework3.Data

import com.example.homework3.R
import com.example.homework3.Model.Reminders

object DataSource {
    val Reminders = listOf(
        Reminders(R.string.day1,R.string.reminder1, R.drawable.medication),
        Reminders(R.string.day2,R.string.reminder2, R.drawable.exercise),
        Reminders(R.string.day3,R.string.reminder3, R.drawable.study),
        Reminders(R.string.day4,R.string.reminder4, R.drawable.meditate),
        Reminders(R.string.day5,R.string.reminder5, R.drawable.work),
        Reminders(R.string.day6,R.string.reminder6, R.drawable.sleep),
        Reminders(R.string.day7,R.string.reminder7, R.drawable.friends),
        Reminders(R.string.day8,R.string.reminder8, R.drawable.party),
    )
}