package org.diegog

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h1
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {
    render(document.getElementById("root")) {
        app()
    }
}

class App : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        div {
            key = "header"
            h1 {
                +"Hello World"
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}