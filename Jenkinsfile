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
                sh 'docker build -t dhruviksparikh/student-rest:latest .'
        }
    }
}
}