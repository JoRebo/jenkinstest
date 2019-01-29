pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                  scannerHome = tool 'sonar_scanner'
                }
                withSonarQubeEnv('sonar_server') {
                    sh "${scannerHome}/bin/sonar-scanner"
                }      
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
