pipeline{

	agent any

	environment {
		DOCKERHUB_CREDENTIALS=credentials('dockerhub-cred-drk')
	}

	stages {
	
		stage('Project Build') {

			steps {
				sh 'mvn package'
			}
		}

		stage('Build') {

			steps {
				sh 'docker build -t dhruviksparikh/student-rest:latest .'
			}
		}

		stage('Login') {

			steps {
				sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
			}
		}

		stage('Push') {

			steps {
				sh 'docker push dhruviksparikh/student-rest:latest'
			}
		}
	}

	post {
		always {
			sh 'docker logout'
		}
	}

}