pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                // Use Maven installation from the specified directory
                sh 'C:\\Users\\Admin\\Downloads\\apache-maven-3.9.6-bin\\apache-maven-3.9.6\\bin\\mvn clean package'
            }
        }
        stage('Test') {
            steps {
                // Use Maven installation from the specified directory
                sh 'C:\\Users\\Admin\\Downloads\\apache-maven-3.9.6-bin\\apache-maven-3.9.6\\bin\\mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Use Maven installation from the specified directory
                sh 'C:\\Users\\Admin\\Downloads\\apache-maven-3.9.6-bin\\apache-maven-3.9.6\\bin\\mvn deploy'
            }
        }
    }
}
