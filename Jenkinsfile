pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                dir("student-rest-mphasis") {
                    sh "mvn clean install"
                }
            }
        }
    }
}
