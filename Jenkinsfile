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
                /*
                script {
                  scannerHome = tool 'sonar_scanner'
                }
                withSonarQubeEnv('sonar_server') {
                    sh "${scannerHome}/bin/sonar-scanner"
                } 
                */
                echo "Sonar Offline"
            }
        }
        stage("Quality Gate") {
            steps {
                /*
                timeout(time: 1, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
                */
                echo "Sonar Offline"
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
