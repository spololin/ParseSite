package org.example

import org.jsoup.Jsoup

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val doc =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get()

    val docQuotes = doc.select("#__next div.sc-2aegk7-2")

    for ((index, value) in docQuotes.withIndex()) {
        println("${index + 1}. ${value.text()}")
    }
}