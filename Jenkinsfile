pipeline {
    agent any

    stages {
        stage('SCM') {
            steps {
                git url: 'https://github.com/JoRebo/jenkinstest.git'
            }
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
        stage("Quality Gate") {
            steps {
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
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
