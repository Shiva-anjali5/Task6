pipeline {
    agent any
    tools {
        // Use the Maven installation configured in Jenkins
        maven 'Maven 3.9.6'
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        // Add more stages as needed
    }
}
