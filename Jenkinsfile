pipeline
{
    agent any
    
    stages
    {
        stage("Checkout") {
            steps {
                git branch: 'main', url: 'https://github.com/Shiva-anjali5/Task6'
            }
        }
        stage("Build")
        {
            steps
            {
                bat 'mvn clean'
            }
        }
        stage("Test")
        {
            steps
            {
                bat 'mvn test'
            }
        }
        stage("Deploy")
        {
            steps
            {
                echo "Deployed Successfully"
            }
        }
    }
}
