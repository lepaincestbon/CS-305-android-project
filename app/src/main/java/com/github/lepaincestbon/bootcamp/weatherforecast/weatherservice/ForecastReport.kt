package com.github.lepaincestbon.bootcamp.weatherforecast.weatherservice

import java.io.Serializable

sealed class ForecastReport : Serializable

data class WeatherForecastReport(
    val main: String,
    val temp: Int,
    val description: String,
    val icon: ByteArray
) : ForecastReport()

object EmptyForecastReport : ForecastReport()
