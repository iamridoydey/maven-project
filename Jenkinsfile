pipeline
{
    agent {
        label 'DevServer'
    }

    tools {
        maven 'myMaven'
        git 'Default'
    }

    stages{
        stage("build"){
            steps {
                echo "mvn clean package"
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: '**/target/*.war'
        }
    }

}