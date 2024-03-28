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
                sh 'mvn clean package'
            }
        }
        // Add more stages as needed
    }
}

