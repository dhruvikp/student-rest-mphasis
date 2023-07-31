pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                    sh 'mvn clean install'
            }
        }
        stage('Building Docker image') {
            steps {
                script {
                    docker.build
                }
            }
        }
    }
}
