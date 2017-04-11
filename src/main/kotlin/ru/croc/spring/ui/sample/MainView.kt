package ru.croc.spring.ui.sample

import tornadofx.*

class MainView : View() {
    private val service : MainService by di()

    override val root = Form()

    private class Model {
        var path by property<String>()
        fun pathProperty() = getProperty(Model::path)

        var jobIsDone by property<Boolean>()
        fun jobIsDoneProperty() = getProperty(Model::jobIsDone)
    }

    private val model = Model()

    init {
        with (root) {
            fieldset("Enter the path") {
                field("Path") {
                    textfield().bind(model.pathProperty())
                }
            }
            button("Start") {
                setOnAction {
                    service.doJob(model.path)
                    model.jobIsDone = true
                }
                disableProperty().bind(model.pathProperty().isNull)
            }
            label(model.pathProperty()) {
                visibleWhen { model.jobIsDoneProperty() }
            }
        }
    }
}