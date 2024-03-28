pipeline {
    agent any
    tools {
        // Use the Maven installation configured in Jenkins
        maven 'Maven'
    }
    stages {
        stage('Build') {
            steps {
                // Execute Maven commands
                sh 'mvn --version'
            }
        }
        // Add more stages as needed
    }
}

