pipeline {
    agent any

    stages {
        stage('Submit the sources to SonarQube') { 
            environment { 
                SONAR_SCANNER_OPTS = "-Xmx2G -Xms256m" 
            } 
            steps { 
                script { 
                    def scannerHome = tool 'sonar_scanner'; 
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
