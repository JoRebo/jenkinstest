pipeline {
    agent any

    stages {
        stage('SCM') {
            git 'https://github.com/JoRebo/jenkinstest.git'
        }
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
