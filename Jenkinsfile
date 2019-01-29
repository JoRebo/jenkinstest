pipeline {
    agent any

    stages {
        stage('SonarQube analysis') {
            steps {
                script {
                  scannerHome = tool 'sonar_scanner'
                }
                withSonarQubeEnv('sonar_server') {
                    sh "${scannerHome}/bin/sonar-scanner"
                }      
            }
        }
        stage('Build') {
            steps {
                def scannerHome = tool 'sonar_scanner'
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
