job("Build and push Docker") {
    docker {
        build {
            context = "docker"
            file = "./docker/Dockerfile"
        }

        push("ami-test.registry.rd-sedov-new-ami.dev.cloud.circlet.aws.intellij.net/p/project/containers/dev-container") {
            tags("latest")
        }
    }
}